package aims.screen;

import aims.Aims;
import aims.media.Media;
import aims.media.Playable;

import javax.swing.*;
import java.awt.*;

public class MediaStore extends JPanel {
    private Media media;
    public MediaStore(Media media) {
        this.media = media;
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        JLabel title= new JLabel(media.getTitle());
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setAlignmentX(CENTER_ALIGNMENT);

        JLabel cost = new JLabel("" + media.getCost() + "$");
        cost.setAlignmentX(CENTER_ALIGNMENT);

        JPanel container = new JPanel();
        container.setLayout(new FlowLayout(FlowLayout.CENTER));
        JButton btAddToCart = new JButton("Add to cart");
        btAddToCart.addActionListener(e->{
            Aims.cart.addMedia(this.media);
        });
        container.add(btAddToCart);

        JButton btPlay = new JButton("Play");
        btPlay.addActionListener(e -> {
            media.play();
        });
        if(media instanceof Playable) {
            container.add(btPlay);
        }

        this.add(Box.createVerticalGlue());
        this.add(title);
        this.add(cost);
        this.add(Box.createVerticalGlue());
        this.add(container);

        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
}
