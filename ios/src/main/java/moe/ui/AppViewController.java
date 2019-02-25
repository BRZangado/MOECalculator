package moe.ui;

import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.RegisterOnStartup;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IBAction;
import org.moe.natj.objc.ann.IBOutlet;
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.Property;
import org.moe.natj.objc.ann.Selector;

import apple.NSObject;
import apple.uikit.UIButton;
import apple.uikit.UILabel;
import apple.uikit.UITextField;
import apple.uikit.UIViewController;
import me.vital.commons.MoeCalculator;

@org.moe.natj.general.ann.Runtime(ObjCRuntime.class)
@ObjCClassName("AppViewController")
@RegisterOnStartup
public class AppViewController extends UIViewController {

    @Owned
    @Selector("alloc")
    public static native AppViewController alloc();

    @Selector("init")
    public native AppViewController init();

    protected AppViewController(Pointer peer) {
        super(peer);
    }

    private MoeCalculator calculator = new MoeCalculator();

    @Property
    @IBOutlet
    @Selector("resultLabel")
    public native UILabel getResultLabel();

    @Property
    @IBOutlet
    @Selector("numberX")
    public native UITextField getNumberX();

    @Property
    @IBOutlet
    @Selector("numberY")
    public native UITextField getNumberY();

    @Property
    @IBOutlet
    @Selector("buttonSum")
    public native UIButton getButtonSum();

    @Property
    @IBOutlet
    @Selector("buttonSubtract")
    public native UIButton getButtonSubtract();

    @IBAction
    @Selector("buttonSumPressed:")
    public void buttonSumPressed(UIButton sender) {
        String x = getNumberX().text();
        String y = getNumberY().text();
        calculator.init(x,y);
        String result = Double.toString(calculator.sum_());
        getResultLabel().setText(result);
    }

    @IBAction
    @Selector("buttonSubtractPressed:")
    public void buttonSubtract(UIButton sender) {
        String x = getNumberX().text();
        String y = getNumberY().text();
        calculator.init(x,y);
        String result = Double.toString(calculator.subtract());
        getResultLabel().setText(result);
    }

}
