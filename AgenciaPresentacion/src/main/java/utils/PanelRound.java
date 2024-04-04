/**
 * Clase que extiende JPanel para proporcionar paneles con esquinas redondeadas personalizadas.
 */
package utils;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JPanel;

public class PanelRound extends JPanel {

    // Atributos
    private int roundTopLeft = 0;
    private int roundTopRight = 0;
    private int roundBottomLeft = 0;
    private int roundBottomRight = 0;

    /**
     * Método constructor que inicializa el panel redondeado.
     */
    public PanelRound() {
        setOpaque(false); // Hace que el panel sea transparente
    }

    /**
     * Método para obtener el radio de redondeo de la esquina superior izquierda.
     * @return El radio de redondeo de la esquina superior izquierda.
     */
    public int getRoundTopLeft() {
        return roundTopLeft;
    }

    /**
     * Método para establecer el radio de redondeo de la esquina superior izquierda.
     * @param roundTopLeft El radio de redondeo de la esquina superior izquierda.
     */
    public void setRoundTopLeft(int roundTopLeft) {
        this.roundTopLeft = roundTopLeft;
        repaint(); // Vuelve a pintar el componente
    }

    /**
     * Método para obtener el radio de redondeo de la esquina superior derecha.
     * @return El radio de redondeo de la esquina superior derecha.
     */
    public int getRoundTopRight() {
        return roundTopRight;
    }

    /**
     * Método para establecer el radio de redondeo de la esquina superior derecha.
     * @param roundTopRight El radio de redondeo de la esquina superior derecha.
     */
    public void setRoundTopRight(int roundTopRight) {
        this.roundTopRight = roundTopRight;
        repaint(); // Vuelve a pintar el componente
    }

    /**
     * Método para obtener el radio de redondeo de la esquina inferior izquierda.
     * @return El radio de redondeo de la esquina inferior izquierda.
     */
    public int getRoundBottomLeft() {
        return roundBottomLeft;
    }

    /**
     * Método para establecer el radio de redondeo de la esquina inferior izquierda.
     * @param roundBottomLeft El radio de redondeo de la esquina inferior izquierda.
     */
    public void setRoundBottomLeft(int roundBottomLeft) {
        this.roundBottomLeft = roundBottomLeft;
        repaint(); // Vuelve a pintar el componente
    }

    /**
     * Método para obtener el radio de redondeo de la esquina inferior derecha.
     * @return El radio de redondeo de la esquina inferior derecha.
     */
    public int getRoundBottomRight() {
        return roundBottomRight;
    }

    /**
     * Método para establecer el radio de redondeo de la esquina inferior derecha.
     * @param roundBottomRight El radio de redondeo de la esquina inferior derecha.
     */
    public void setRoundBottomRight(int roundBottomRight) {
        this.roundBottomRight = roundBottomRight;
        repaint(); // Vuelve a pintar el componente
    }

    /**
     * Método que se invoca cuando es necesario pintar el componente.
     * @param grphcs El contexto gráfico en el que se pinta el componente.
     */
    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Dibuja el panel con las esquinas redondeadas
        g2.setColor(getBackground());
        Area area = new Area(createRoundTopLeft());
        if (roundTopRight > 0) {
            area.intersect(new Area(createRoundTopRight()));
        }
        if (roundBottomLeft > 0) {
            area.intersect(new Area(createRoundBottomLeft()));
        }
        if (roundBottomRight > 0) {
            area.intersect(new Area(createRoundBottomRight()));
        }
        g2.fill(area);

        g2.dispose();
        super.paintComponent(grphcs);
    }

    /**
     * Método privado para crear la forma de la esquina superior izquierda redondeada.
     * @return La forma de la esquina superior izquierda redondeada.
     */
    private Shape createRoundTopLeft() {
        int width = getWidth();
        int height = getHeight();
        int roundX = Math.min(width, roundTopLeft);
        int roundY = Math.min(height, roundTopLeft);
        Area area = new Area(new RoundRectangle2D.Double(0, 0, width, height, roundX, roundY));
        area.add(new Area(new Rectangle2D.Double(roundX / 2, 0, width - roundX / 2, height)));
        area.add(new Area(new Rectangle2D.Double(0, roundY / 2, width, height - roundY / 2)));
        return area;
    }

    /**
     * Método privado para crear la forma de la esquina superior derecha redondeada.
     * @return La forma de la esquina superior derecha redondeada.
     */
    private Shape createRoundTopRight() {
        int width = getWidth();
        int height = getHeight();
        int roundX = Math.min(width, roundTopRight);
        int roundY = Math.min(height, roundTopRight);
        Area area = new Area(new RoundRectangle2D.Double(0, 0, width, height, roundX, roundY));
        area.add(new Area(new Rectangle2D.Double(0, 0, width - roundX / 2, height)));
        area.add(new Area(new Rectangle2D.Double(0, roundY / 2, width, height - roundY / 2)));
        return area;
    }

    /**
     * Método privado para crear la forma de la esquina inferior izquierda redondeada.
     * @return La forma de la esquina inferior izquierda redondeada.
     */
    private Shape createRoundBottomLeft() {
        int width = getWidth();
        int height = getHeight();
        int roundX = Math.min(width, roundBottomLeft);
        int roundY = Math.min(height, roundBottomLeft);
        Area area = new Area(new RoundRectangle2D.Double(0, 0, width, height, roundX, roundY));
        area.add(new Area(new Rectangle2D.Double(roundX / 2, 0, width - roundX / 2, height)));
        area.add(new Area(new Rectangle2D.Double(0, 0, width, height - roundY / 2)));
        return area;
    }

    /**
     * Método privado para crear la forma de la esquina inferior derecha redondeada.
     * @return La forma de la esquina inferior derecha redondeada.
     */
    private Shape createRoundBottomRight() {
        int width = getWidth();
        int height = getHeight();
        int roundX = Math.min(width, roundBottomRight);
        int roundY = Math.min(height, roundBottomRight);
        Area area = new Area(new RoundRectangle2D.Double(0, 0, width, height, roundX, roundY));
        area.add(new Area(new Rectangle2D.Double(0, 0, width - roundX / 2, height)));
        area.add(new Area(new Rectangle2D.Double(0, 0, width, height - roundY / 2)));
        return area;
    }
}
