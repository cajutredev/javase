package mx.org.banxico.modulo15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import org.h2.tools.Server;


public class CRUDEstudiantes {

    private static final Scanner scanner = new Scanner(System.in);
    private static final String URL = "jdbc:h2:mem:escuela;DB_CLOSE_DELAY=-1";
    private static final String USUARIO = "sa";
    private static final String PASSWORD = "";

    public static Connection obtenerConexion() throws SQLException {

        return DriverManager.getConnection(
                URL,
                USUARIO,
                PASSWORD);
    }

    public static void crearTabla() {

        String sql = """
                CREATE TABLE IF NOT EXISTS estudiantes (
                    id INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
                    nombre VARCHAR(100) NOT NULL,
                    edad INTEGER NOT NULL,
                    correo VARCHAR(100) NOT NULL
                )
                """;

        try (Connection conexion = obtenerConexion();
                Statement statement = conexion.createStatement()) {

            statement.execute(sql);

            System.out.println("Tabla ESTUDIANTES preparada.");

        } catch (SQLException e) {

            System.out.println("Error al crear la tabla: " + e.getMessage());
        }
    }


    public static void main(String[] args) {

        try {
            // Iniciar servidor TCP para permitir conexiones externas a H2.
            Server tcpServer = Server.createTcpServer(
                    "-tcp",
                    "-tcpPort", "9092").start();

            // Iniciar consola web de H2.
            Server webServer = Server.createWebServer(
                    "-web",
                    "-webPort", "8082").start();

            System.out.println("Servidor TCP: " + tcpServer.getURL());
            System.out.println("Consola web: " + webServer.getURL());
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // Prepara la tabla antes de mostrar el menú.
        crearTabla();

        int opcion;

        do {

            System.out.println("\n===== SISTEMA DE ESTUDIANTES =====");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Listar estudiantes");
            System.out.println("3. Buscar estudiante");
            System.out.println("4. Actualizar estudiante");
            System.out.println("5. Eliminar estudiante");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opción: ");

            try {

                opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {

                    case 1:
                        break;

                    case 2:
                        break;

                    case 3:
                        break;

                    case 4:
                        break;

                    case 5:
                        break;

                    case 6:
                        System.out.println("Finalizando programa...");
                        break;

                    default:
                        System.out.println("Opción no válida.");
                }

            } catch (NumberFormatException e) {

                opcion = 0;
                System.out.println("Debes ingresar un número válido.");
            }

        } while (opcion != 6);

        scanner.close();
    }
}
