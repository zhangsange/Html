package com.zzhoujay.html;

import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

import org.xml.sax.Attributes;

/**
 * 时间：2019/2/20 13:53  <br/>
 * 作者：zhangzhi  <br/>
 * 邮箱：crazyhelloworld@163.com  <br/>
 * 描述：
 */
public class ImageSpanWithAttr extends ImageSpan {
    private Attributes attr;
    private ImageSpanWithAttr(Drawable d, String source) {
        super(d, source);
    }
    public ImageSpanWithAttr(Drawable d, String source,Attributes attr) {
        super(d, source);
        this.attr = attr;
    }

    public Attributes getAttr() {
        return attr;
    }

    public void setAttr(Attributes attr) {
        this.attr = attr;
    }
}
