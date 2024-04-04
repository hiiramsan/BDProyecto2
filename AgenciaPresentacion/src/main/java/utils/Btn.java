package utils;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

/**
 * Clase que extiende JButton para proporcionar botones personalizados con colores y efectos visuales.
 */

public class Btn extends JButton {

    // Atributos
    private boolean over;
    private Color color;
    private Color colorOver;
    private Color colorClick;
    private Color borderColor;
    private int radius = 0;

    /**
     * Método constructor que inicializa los atributos y establece el comportamiento del botón.
     */
    public Btn() {
        //  Inicializar Color
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setColor(Color.WHITE);
        colorOver = new Color(179, 250, 160);
        colorClick = new Color(152, 184, 144);
        borderColor = new Color(255, 255, 255);
        setContentAreaFilled(false);
        //  Agregar eventos de ratón
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent me) {
                setBackground(colorOver);
                over = true;
            }

            @Override
            public void mouseExited(MouseEvent me) {
                setBackground(color);
                over = false;
            }

            @Override
            public void mousePressed(MouseEvent me) {
                setBackground(colorClick);
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                if (over) {
                    setBackground(colorOver);
                } else {
                    setBackground(color);
                }
            }
        });
    }

    /**
     * Devuelve si el cursor está sobre el botón.
     * @return true si el cursor está sobre el botón, false de lo contrario.
     */
    public boolean isOver() {
        return over;
    }

    /**
     * Establece si el cursor está sobre el botón.
     * @param over true para indicar que el cursor está sobre el botón, false de lo contrario.
     */
    public void setOver(boolean over) {
        this.over = over;
    }

    /**
     * Devuelve el color de fondo del botón.
     * @return El color de fondo del botón.
     */
    public Color getColor() {
        return color;
    }

    /**
     * Establece el color de fondo del botón.
     * @param color El color de fondo del botón.
     */
    public void setColor(Color color) {
        this.color = color;
        setBackground(color);
    }

    /**
     * Devuelve el color de fondo cuando el cursor está sobre el botón.
     * @return El color de fondo cuando el cursor está sobre el botón.
     */
    public Color getColorOver() {
        return colorOver;
    }

    /**
     * Establece el color de fondo cuando el cursor está sobre el botón.
     * @param colorOver El color de fondo cuando el cursor está sobre el botón.
     */
    public void setColorOver(Color colorOver) {
        this.colorOver = colorOver;
    }

    /**
     * Devuelve el color de fondo cuando el botón está siendo presionado.
     * @return El color de fondo cuando el botón está siendo presionado.
     */
    public Color getColorClick() {
        return colorClick;
    }

    /**
     * Establece el color de fondo cuando el botón está siendo presionado.
     * @param colorClick El color de fondo cuando el botón está siendo presionado.
     */
    public void setColorClick(Color colorClick) {
        this.colorClick = colorClick;
    }

    /**
     * Devuelve el color del borde del botón.
     * @return El color del borde del botón.
     */
    public Color getBorderColor() {
        return borderColor;
    }

    /**
     * Establece el color del borde del botón.
     * @param borderColor El color del borde del botón.
     */
    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }

    /**
     * Devuelve el radio de redondeo de las esquinas del botón.
     * @return El radio de redondeo de las esquinas del botón.
     */
    public int getRadius() {
        return radius;
    }

    /**
     * Establece el radio de redondeo de las esquinas del botón.
     * @param radius El radio de redondeo de las esquinas del botón.
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }

    /**
     * Método para dibujar el componente del botón.
     * @param grphcs El contexto gráfico en el que se dibuja el componente.
     */
    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        //  Dibujar Borde
        g2.setColor(borderColor);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
        g2.setColor(getBackground());
        //  Borde establecido en 2 píxeles
        g2.fillRoundRect(1, 1, getWidth() - 4, getHeight() - 4, radius, radius);
        super.paintComponent(grphcs);
    }
}