
//Sample03
import java.awt.*;
import java.awt.event.*;

public class Sample03 extends Frame implements ItemListener {
    TextField tf01 = new TextField("", 60);
    TextField tf02 = new TextField("", 20);
    CheckboxGroup cbg = new CheckboxGroup();
    int pc = -1;

    // 主処理
    public static void main(String ar[]) {
        Frame f = new Sample03();
        f.setTitle("ラジオボタンクリックとテキストフィールド表示");
        f.setSize(640, 400);
        f.setVisible(true);
    }

    // 部品セット
    Sample03() {
        setLayout(new FlowLayout());
        Checkbox rb1 = new Checkbox("abc", cbg, true);
        Checkbox rb2 = new Checkbox("xyz", cbg, false);
        rb1.addItemListener(this);
        rb2.addItemListener(this);
        add(rb1);
        add(rb2);
        add(tf01);
        add(tf02);
        addWindowListener(new WinAdapter());
    }

    // 閉じる
    class WinAdapter extends WindowAdapter {
        public void windowClosing(WindowEvent we) {
            System.exit(0);
        }
    }

    // 描画
    public void paint(Graphics g) {
        String s0 = "ああああ";
        String s1 = "いいいいいいいいいい";
        if (pc > -1) {
            tf01.setText("");
            tf02.setText("");
        }
        if (pc == 0) {
            tf01.setText(s0);
            tf02.setText(s1);
        }
        if (pc == 1) {
            tf01.setText(s1);
            tf02.setText(s0);
        }
    }

    // イベント
    public void itemStateChanged(ItemEvent ie) {
        if (cbg.getSelectedCheckbox().getLabel() == "abc") {
            pc = 0;
            repaint();
        }
        if (cbg.getSelectedCheckbox().getLabel() == "xyz") {
            pc = 1;
            repaint();
        }
    }
}