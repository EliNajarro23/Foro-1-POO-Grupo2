import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.HashMap;
import java.util.Map;

public class GestionEstudiantesGUI extends JFrame {

    // Map para almacenar los estudiantes (carnet -> Estudiante)
    private final Map<String, Estudiante> mapaEstudiantes = new HashMap<>();

    // Componentes de la interfaz
    private final JTextField campoCarnet;
    private final JTextField campoNombre;
    private final JTextArea areaResultado;
    private final JButton botonIngresar;
    private final JButton botonBuscar;
    private final JButton botonEliminar;
    private final JButton botonMostrar;

    public GestionEstudiantesGUI() {
        // Configuración de la ventana
        setTitle("Gestión de Estudiantes UDB VIRTUAL");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar la ventana

        // Crear panel principal
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2, 10, 10));

        // Campos de texto
        panel.add(new JLabel("Carnet:"));
        campoCarnet = new JTextField();
        panel.add(campoCarnet);

        panel.add(new JLabel("Nombre Completo:"));
        campoNombre = new JTextField();
        panel.add(campoNombre);

        // Botones
        botonIngresar = new JButton("Ingresar Alumno");
        botonBuscar = new JButton("Buscar Alumno");
        botonEliminar = new JButton("Eliminar Alumno");
        botonMostrar = new JButton("Mostrar Todos");

        panel.add(botonIngresar);
        panel.add(botonBuscar);
        panel.add(botonEliminar);
        panel.add(botonMostrar);

        // Área de resultado
        areaResultado = new JTextArea();
        areaResultado.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(areaResultado);
        panel.add(scrollPane);

        // Agregar panel a la ventana
        add(panel);

        // Asignar acciones a los botones
        botonIngresar.addActionListener((ActionEvent e) -> {
            ingresarAlumno();
        });

        botonBuscar.addActionListener((ActionEvent e) -> {
            buscarAlumno();
        });

        botonEliminar.addActionListener((ActionEvent e) -> {
            eliminarAlumno();
        });

        botonMostrar.addActionListener((ActionEvent e) -> {
            mostrarTodosLosAlumnos();
        });
    }

    // Método para ingresar un alumno
    private void ingresarAlumno() {
        String carnet = campoCarnet.getText();
        String nombre = campoNombre.getText();

        if (carnet.isEmpty() || nombre.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
            return;
        }

        mapaEstudiantes.put(carnet, new Estudiante(carnet, nombre));
        areaResultado.setText("Alumno ingresado exitosamente.");
        campoCarnet.setText("");
        campoNombre.setText("");
    }

    // Método para buscar un alumno
    private void buscarAlumno() {
        String carnet = campoCarnet.getText();

        if (carnet.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un carnet.");
            return;
        }

        Estudiante estudiante = mapaEstudiantes.get(carnet);
        if (estudiante != null) {
            areaResultado.setText("Alumno encontrado:\n" + estudiante);
        } else {
            areaResultado.setText("Alumno no encontrado, no se puede mostrar.");
        }
    }

    // Método para eliminar un alumno
    private void eliminarAlumno() {
        String carnet = campoCarnet.getText();

        if (carnet.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un carnet.");
            return;
        }

        if (mapaEstudiantes.remove(carnet) != null) {
            areaResultado.setText("Alumno eliminado exitosamente.");
        } else {
            areaResultado.setText("Alumno no encontrado, no se puede eliminar.");
        }
    }

    // Método para mostrar todos los alumnos
    private void mostrarTodosLosAlumnos() {
        if (mapaEstudiantes.isEmpty()) {
            areaResultado.setText("No hay alumnos registrados.");
        } else {
            StringBuilder resultado = new StringBuilder("--- Lista de Alumnos ---\n");
            mapaEstudiantes.entrySet().forEach((entry) -> {
                resultado.append(entry.getValue()).append("\n");
            });
            areaResultado.setText(resultado.toString());
        }
    }

    // Clase interna para representar a un estudiante
    private static class Estudiante {
        String carnet;
        String nombreCompleto;

        public Estudiante(String carnet, String nombreCompleto) {
            this.carnet = carnet;
            this.nombreCompleto = nombreCompleto;
        }

        @Override
        public String toString() {
            return "Carnet: " + carnet + ", Nombre: " + nombreCompleto;
        }
    }

    // Método principal
    public static void main(String[] args) {
        // Ejecutar la interfaz gráfica
        SwingUtilities.invokeLater(() -> {
            new GestionEstudiantesGUI().setVisible(true);
        });
    }
}