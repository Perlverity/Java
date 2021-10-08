
//Sample21
import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sample21 extends Applet implements ActionListener {
    private static final String labelTitle = "ボタンクリックで文字列表示";
    private static final String b0_title = "1999";
    private static final String b1_title = "2000";
    private static final String b2_title = "2001";
    private static final int windowWidth = 320;
    private static final int windowHeight = 200;
    private static final int drawX = 100;
    private static final int drawY = 150;
    private static final long serialVersionUID = 1L;
    Button b0;
    Button b1;
    Button b2;
    int swithCode = -1;

    // 初期処理
        public void init() {
        this.setSize(Sample21.windowWidth, Sample21.windowHeight);
        this.add(new Label(Sample21.labelTitle));
        this.b0 = new Button(Sample21.b0_title);
        this.b1 = new Button(Sample21.b1_title);
        this.b2 = new Button(Sample21.b2_title);
        this.add(this.b0);
        this.add(this.b1);
        this.add(this.b2);
        this.b0.addActionListener(this);
        this.b1.addActionListener(this);
        this.b2.addActionListener(this);
    }

    // 描画
    public void paint(final Graphics g) {
        final String s0 = "あああああ";
        final String s1 = "いいいいいいいいい";
        final String s2 = "ううう";
        if (this.swithCode > -1) {
            g.clearRect(0, 0, Sample21.windowWidth - 1, Sample21.windowHeight - 1);
        }
        if (this.swithCode == 0) {
            g.drawString(s0, Sample21.drawX, Sample21.drawY);
        }
        if (this.swithCode == 1) {
            g.drawString(s1, Sample21.drawX, Sample21.drawY);
        }
        if (this.swithCode == 2) {
            g.drawString(s2, Sample21.drawX, Sample21.drawY);
        }
    }

    // イベント
    public void actionPerformed(final ActionEvent ae) {
        if (ae.getSource() == this.b0) {
            this.swithCode = 0;
            this.repaint();
        }
        if (ae.getSource() == this.b1) {
            this.swithCode = 1;
            this.repaint();
        }
        if (ae.getSource() == this.b2) {
            this.swithCode = 2;
            this.repaint();
        }
    }
}