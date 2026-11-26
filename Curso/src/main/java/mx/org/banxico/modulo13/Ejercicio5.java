package mx.org.banxico.modulo13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

public class Ejercicio5 {

    public static void main(String[] args) {
        
        List<Venta> ventas = new ArrayList<>();

        ventas.add(new Venta(1, "Carlos", "Laptop", 3, 26000, "Enero"));
        ventas.add(new Venta(2, "Ana", "Tablet", 3, 14500, "Febrero"));
        ventas.add(new Venta(3, "Carlos", "Tablet", 3, 9800, "Marzo"));
        ventas.add(new Venta(4, "Ana", "Laptop", 3, 7200, "Abril"));
        ventas.add(new Venta(5, "Jorge", "Teclado mecanico", 3, 1800, "Mayo"));
        ventas.add(new Venta(6, "Carlos", "Audifonos inalambricos", 3, 3200, "Junio"));
        ventas.add(new Venta(7, "Diego", "Laptop", 3, 5400, "Julio"));
        ventas.add(new Venta(8, "Valeria", "Camara digital", 3, 12500, "Agosto"));
        ventas.add(new Venta(9, "Andres", "Consola de videojuegos", 3, 11500, "Septiembre"));

        // 1. Mostrar todas las ventas.
        System.out.println("========= Todas las Ventas ==========");
        //ventas.stream().forEach(System.out::println);

        // 2. Calcular el importe de cada venta.
        System.out.println("========= Mostrar resumen de ventas ==========");
        ventas.stream()
            .map(venta -> 
                "Venta " + venta.getId() +
                " - " + venta.getProducto() +
                " - Importe: $" + venta.getImporte())
            .forEach(System.out::println);

        // 3. Obtener las ventas superiores a $10,000.
        System.out.println("========= Ventas superiores a 10,000 ==========");
        ventas.stream()
            .filter(venta -> venta.getImporte() > 10000)
            .forEach(System.out::println);
            
        //4. Calcular el importe total de todas las ventas.
        System.out.println("========= Gran Total de Ventas ==========");
        double totalVentas = ventas.stream()
                .mapToDouble(Venta::getImporte)
                .sum();
        
        System.out.printf("Total vendido: $%.2f", totalVentas);
        System.out.println();

        // 5. Agrupar las ventas por vendedor.
        System.out.println("========= Resumen de ventas por Vendedor ==========");
        Map<String, List<Venta>> ventasPorVendedor = ventas.stream()
            .collect(Collectors.groupingBy(
                Venta::getVendedor,
                Collectors.toList()
            ));

        ventasPorVendedor.forEach((vendedor, lista) -> {
            System.out.println("\nResumen por vendedor: " + vendedor);
            lista.forEach(venta -> System.out.println(" " + venta));
        });

        // 6. Obtener el vendedor con mayores ingresos.
        System.out.println("========= Vendedor con mayores ingresos ==========");
        Map<String, Double> sumaPorVendedor = ventas.stream()
            .collect(Collectors.groupingBy(
                Venta::getVendedor,
                Collectors.summingDouble(Venta::getImporte)
            ));

            
        Optional<Map.Entry<String,Double>> mejorVendedor = sumaPorVendedor.entrySet()
            .stream().max(Map.Entry.comparingByValue());
        
        mejorVendedor.ifPresentOrElse(
            vendedor -> System.out.printf("Ingresos: $%.2f%n", vendedor.getValue()), 
            () -> System.out.println("No existen ventas"));
            
        // 7. Calcular el total vendido por mes.
        System.out.println("========= total vendido por mes ==========");
        Map<String, Double> ventasPorMes = ventas.stream()
            .collect(Collectors.groupingBy(
                Venta::getMes,
                Collectors.summingDouble(Venta::getImporte)
            ));
        
        System.out.println(ventasPorMes);
        
        // 8. Obtener el producto mas vendido por unidades.
        System.out.println("========= Producto mas vendido por unidades ==========");
        Map<String, Integer> unidadesPorProducto = ventas.stream()
            .collect(Collectors.groupingBy(
                Venta::getProducto,
                Collectors.summingInt(Venta::getCantidad)
            ));

        Optional<Map.Entry<String,Integer>> productoMasVendido = unidadesPorProducto.entrySet()
            .stream().max(Map.Entry.comparingByValue());
        
        productoMasVendido.ifPresentOrElse(
            producto -> System.out.printf("Unidades vendidas: %s", producto.getValue()), 
            () -> System.out.println("No existen ventas"));


       // 9. Ordenar los vendedores segun sus ingresos.

        System.out.println("\n\n========= Vendedores ordenados por ingresos ==========");

        sumaPorVendedor.entrySet()
            .stream()
            .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
            .forEach(vendedor ->
                System.out.printf("%s: $%.2f%n", vendedor.getKey(), vendedor.getValue()));

        // 10. Obtener las cinco ventas de mayor importe.
        System.out.println("\n\n========= Las 5 venta con mayor importe ==========");
        ventas.stream()
                .sorted(Comparator.comparingDouble(Venta::getImporte).reversed())
                .limit(5)
                .forEach(System.out::println);
                
    }
}

@NoArgsConstructor 
@AllArgsConstructor 
@Setter 
@Getter 
@ToString 
class Venta {

    private int id;
    private String vendedor;
    private String producto;
    private int cantidad;
    private double precioUnitario;
    private String mes;
    
    public double getImporte() {
        return cantidad * precioUnitario;
    }
}
