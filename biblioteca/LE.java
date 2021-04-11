package biblioteca;

import java.awt.*;
import javax.swing.*;

/**
 * La clase <code>LE</code> facilita la Lectura y Escritura de datos a través
 * de cuadros de diálogos.
 * 
 * @author Ing. Juan José Flores Cueto
 * @version 2.2
 * @Date Octubre 2006
 * @version 2.1
 * @Date Agosto 2006
 * 
 * @author Ing. Jessica Paulino Torre
 * @author Ing. Gissela Guzman Mariluz
 * @version 1.0
 * @Date Enero 2004
 * 
 * Clase LE utilizada con fines académicos.
 * 
 */


public class LE {

	/**
	 * Muestra un cuadro de diálogo solicitando el ingreso de un caracter.
	 * 
	 * @param mensaje
	 *            especifica la solicitud del caracter a ingresar.
	 */
	public static char leerChar(String mensaje) {
		String cadena;
		do {
			cadena = JOptionPane.showInputDialog(mensaje);
			if (cadena == null)
				mostrarError("Error... no se ha ingresado valor");
			if (cadena.length() > 1)
				mostrarError("Error... debe ingresar sólo un caracter");
		} while (cadena == null || cadena.length() > 1);
		char c = cadena.charAt(0);
		return c;
	}

	/**
	 * Muestra un cuadro de diálogo solicitando el ingreso de un valor real
	 * double.
	 * 
	 * @param mensaje
	 *            especifica la solicitud del valor a ingresar.
	 * 
	 */
	public static double leerDouble(String mensaje) {
		String cadena = leerString(mensaje);
		try {
			return Double.parseDouble(cadena);
		} catch (NumberFormatException e) {
			mostrarError("Error... debe ingresar un número ");
			return leerDouble(mensaje);
		}
	}

	/**
	 * Muestra un cuadro de diálogo solicitando el ingreso de un valor real
	 * float.
	 * 
	 * @param mensaje
	 *            especifica la solicitud del valor a ingresar.
	 */
	public static float leerFloat(String mensaje) {
		String cadena = leerString(mensaje);
		try {
			return Float.parseFloat(cadena);
		} catch (NumberFormatException e) {
			mostrarError("Error... debe ingresar un número ");
			return leerFloat(mensaje);
		}
	}

	/**
	 * Muestra un cuadro de diálogo solicitando el ingreso de un valor entero
	 * int.
	 * 
	 * @param mensaje
	 *            especifica la solicitud del valor a ingresar.
	 */
	public static int leerInt(String mensaje) {
		String cadena = leerString(mensaje);
		try {
			return Integer.parseInt(cadena);
		} catch (NumberFormatException e) {
			mostrarError("Error... debe ingresar un número ");
			return leerInt(mensaje);
		}
	}

	/**
	 * Muestra un cuadro de diálogo solicitando el ingreso de un valor entero
	 * long.
	 * 
	 * @param mensaje
	 *            especifica la solicitud del valor a ingresar.
	 */
	public static long leerLong(String mensaje) {
		String cadena = leerString(mensaje);
		try {
			return Long.parseLong(cadena);
		} catch (NumberFormatException e) {
			mostrarError("Error... debe ingresar un número ");
			return leerLong(mensaje);
		}
	}

	/**
	 * Muestra un cuadro de diálogo solicitando el ingreso de una cadena.
	 * 
	 * @param mensaje
	 *            especifica la solicitud de la cadena a ingresar.
	 */
	public static String leerString(String mensaje) {
		String cadena;
		do {
			cadena = JOptionPane.showInputDialog(mensaje);
			if (cadena == null)
				mostrarError("Error... no se ha ingresado valor");
		} while (cadena == null);
		return cadena;
	}

	/**
	 * Muestra un cuadro de diálogo solicitando el ingreso de una clave seceta
	 * 
	 * Método leerClave. El método leerClave de la clase LE es un método
	 * incorporado en la versión 2.0 ha sido creado sobrecargado. Puede utilizar
	 * tres versiones. El método que no recibe parámetros coloca un titulo y un
	 * mensaje por default. el método que recibe un parámetro muestra el titulo
	 * especificado y un mensaje por default y el método que recibe dos
	 * parámetro muestra el título y el mensaje especificado. Observe como se
	 * reusa el método.
	 * 
	 * @return un string con la clave ingresada. Si cierra la ventana o cancela
	 *         retorna una cadena vacia
	 * 
	 * 
	 */

	public static String leerClave() {
		return leerClave("", "");
	}

	public static String leerClave(String titulo) {
		return leerClave(titulo, "");
	}

	public static String leerClave(String tituloVentana, String mensaje) {
		if (tituloVentana.equalsIgnoreCase("")) {
			tituloVentana = "Bienvenido";
		}
		if (mensaje.equalsIgnoreCase("")) {
			mensaje = "Ingrese su clave";
		}

		JPanel panel = new JPanel();
		JLabel etiqueta = new JLabel(mensaje);
		JPasswordField jpfClave = new JPasswordField(10);
		panel.add(etiqueta);
		panel.add(jpfClave);

		Object[] nombres = { "Clave ok", "Cancela clave" };
		int rpta = JOptionPane.showOptionDialog(null, panel, tituloVentana,
				JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null,
				nombres, nombres[0]);

		if (rpta != 0) {
			return "";
		} else {
			return String.valueOf(jpfClave.getPassword());
		}
	}

	/**
	 * Muestra un cuadro de diálogo con algún tipo de mensaje. No presenta
	 * ícono.
	 * 
	 * @param mensaje
	 *            es el mensaje a mostrar.
	 */
	public static void mostrarResultado(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "Resultado",
				JOptionPane.PLAIN_MESSAGE);
	}

	/**
	 * Muestra un cuadro de diálogo con una advertencia especificada en el
	 * argumento.
	 * 
	 * @param mensaje
	 *            es la advertencia a mostrar.
	 */
	public static void mostrarAdvertencia(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "Advertencia",
				JOptionPane.WARNING_MESSAGE);
	}

	/**
	 * Muestra un cuadro de diálogo con un mensaje de error especificado en el
	 * argumento.
	 * 
	 * @param mensaje
	 *            es el error a mostrar.
	 */
	public static void mostrarError(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "Error",
				JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * Muestra un cuadro de diálogo con un mensaje de información especificado
	 * en el argumento.
	 * 
	 * Método mostrarInformacion: Método sobrecargado, creandose el segundo
	 * método. El método mostrarInformación de la clase LE ha sido sobrecargado.
	 * Ahora Ud. puede utilizar dos versiones. El método que recibe un parámetro
	 * muestra la información en forma tradicional. El método que recibe cinco
	 * parámetros tienen la posibilidad de incluir un título en la ventana, un
	 * texto de titulo al interior del cuadro, mostrar la información en una
	 * área de texto con la posibilidad de hacer scroll cuando se necesita
	 * mostrar gran cantidad de información, cambiar la etiqueta del botón que
	 * se muestra en la parte inferior del cuadro y cambiar el color de fondo
	 * del área de texto.
	 */

	public static void mostrarInformacion(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "Información",
				JOptionPane.INFORMATION_MESSAGE);
	}

	public static void mostrarInformacion(String tituloVentana,
			String tituloInterno, String mensaje, String nombreBoton, Color color) {

		JPanel panel = new JPanel();
		panel.setLayout(new java.awt.BorderLayout(15,15));
		
		JLabel cabecera = new JLabel("");
		
		JTextArea muestraInformacion = new JTextArea(10, 30);
		muestraInformacion.setEditable(false);

		if (tituloVentana == null)
			tituloVentana = "Información";
		if (tituloInterno != null)
			cabecera.setText(tituloInterno);
		if (mensaje == null)
			mensaje = "No hay datos para visualizar";
		if (color != null)
			muestraInformacion.setBackground(color);

		muestraInformacion.append(mensaje);
		JScrollPane desplazaInformacion = new JScrollPane(muestraInformacion);
		
		panel.add( "North",cabecera);
        panel.add( "Center", new Canvas());
        panel.add( "South",desplazaInformacion);

		if (nombreBoton != null) {
			Object[] nombres = {nombreBoton};
			JOptionPane.showOptionDialog(null, panel, tituloVentana,
					JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE,
					null, nombres, nombres[0]);
		} else {
			JOptionPane.showMessageDialog(null, panel, tituloVentana,
					JOptionPane.INFORMATION_MESSAGE);
		}
	}

	/**
	 * Muestra un cuadro de diálogo con una pregunta especificada en el
	 * argumento.
	 * 
	 * @param mensaje
	 *            es la pregunta a mostrar.
	 */
	public static void mostrarPregunta(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "Pregunta",
				JOptionPane.QUESTION_MESSAGE);
	}

	/**
	 * Muestra un cuadro de diálogo con una pregunta especificada en el
	 * argumento y 2 opciones de respuesta a elegir.
	 * 
	 * @param mensaje
	 *            es la pregunta a mostrar.
	 * @return el entero 0 o 1 si se presionó el botón con la opción YES o NO
	 *         respectivamente. Si se cierra este cuadro de diálogo sin
	 *         presionar algún botón, retorna el entero -1.
	 */
	public static int mostrarPreguntaOpcion2(String mensaje) {
		return JOptionPane.showOptionDialog(null, mensaje, "Pregunta",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
				null, null);
	}

	/**
	 * Muestra un cuadro de diálogo con una pregunta especificada en el
	 * argumento y 3 opciones de respuesta a elegir.
	 * 
	 * @param mensaje
	 *            es la pregunta a mostrar.
	 * @return el entero 0, 1 o 2 si se presionó el botón con la opción YES, NO
	 *         o CANCEL respectivamente. Si se cierra este cuadro de diálogo sin
	 *         presionar algún botón, retorna el entero -1.
	 */
	public static int mostrarPreguntaOpcion3(String mensaje) {
		return JOptionPane.showOptionDialog(null, mensaje, "Pregunta",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
				null, null, null);
	}

	/**
	 * Muestra un cuadro de diálogo con un combo para selecciona una opción de
	 * múltiples opciones.
	 * 
	 * @param opciones
	 *         es un arreglo de cadenas con las opciones a mostrar.
	 * @return un string con la opción seleccionada. Si cierra la ventana o
	 *         cancela retorna una cadena vacia.
	 * 
	 */
	public static String seleccionarOpcion(String tituloVentana,
		String mensaje, String[] opciones) {
		String rpta = (String) JOptionPane.showInputDialog(null, mensaje,
				tituloVentana, JOptionPane.QUESTION_MESSAGE, null, opciones,
				opciones[0]);
		if (rpta == null) {
			rpta = "";
		}
		return rpta;
	}

	/**
	 * Muestra un cuadro de diálogo con un combo para selecciona una opción de
	 * múltiples opciones.
	 * 
	 * @param opciones
	 *         es un arreglo de cadenas con las opciones a mostrar.
	 * @return un entero con la posición de la opción seleccionada. Si cierra 
	 *         la ventana o cancela retorna -1.
	 * 
	 */
	public static int seleccionarOpcionIndex(String tituloVentana,
		String mensaje, String[] opciones) {
		String rpta = (String) JOptionPane.showInputDialog(null, mensaje,
				tituloVentana, JOptionPane.QUESTION_MESSAGE, null, opciones,
				opciones[0]);
		if (rpta != null) {
			for (int i=0; i<opciones.length; i++) {
				if (opciones[i] == rpta) {
					return i;
				}
			}
		}	
		return -1;
	}
	
}
