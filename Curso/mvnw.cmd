@echo off
setlocal

set "MAVEN_VERSION=3.9.9"
set "MAVEN_WRAPPER_DIST=%USERPROFILE%\.m2\wrapper\dists\apache-maven-%MAVEN_VERSION%"
set "MAVEN_HOME=%MAVEN_WRAPPER_DIST%\apache-maven-%MAVEN_VERSION%"

if not exist "%MAVEN_HOME%\bin\mvn.cmd" (
    if not exist "%MAVEN_WRAPPER_DIST%" (
        mkdir "%MAVEN_WRAPPER_DIST%"
        if errorlevel 1 exit /b 1
    )

    set "MAVEN_WRAPPER_ARCHIVE=%MAVEN_WRAPPER_DIST%\apache-maven-%MAVEN_VERSION%-bin.zip"
    powershell -NoProfile -ExecutionPolicy Bypass -Command "$ErrorActionPreference = 'Stop'; try { Invoke-WebRequest -Uri 'https://repo.maven.apache.org/maven2/org/apache/maven/apache-maven/%MAVEN_VERSION%/apache-maven-%MAVEN_VERSION%-bin.zip' -OutFile $env:MAVEN_WRAPPER_ARCHIVE; Expand-Archive -LiteralPath $env:MAVEN_WRAPPER_ARCHIVE -DestinationPath $env:MAVEN_WRAPPER_DIST -Force; Remove-Item -LiteralPath $env:MAVEN_WRAPPER_ARCHIVE -Force } catch { Write-Error $_; exit 1 }"
    if errorlevel 1 exit /b 1
)

if not exist "%MAVEN_HOME%\bin\mvn.cmd" (
    echo Maven could not be installed in "%MAVEN_HOME%".
    exit /b 1
)

call "%MAVEN_HOME%\bin\mvn.cmd" %*
exit /b %ERRORLEVEL%
