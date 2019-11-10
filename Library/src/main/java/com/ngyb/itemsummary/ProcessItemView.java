package com.ngyb.itemsummary;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.Nullable;

/**
 * 作者：南宫燚滨
 * 描述：
 * 邮箱：nangongyibin@gmail.com
 * 日期：2019/11/10 11:14
 */
public class ProcessItemView extends LinearLayout {

    private TextView tvLeft;
    private TextView tvMiddle;
    private TextView tvRight;
    private ProgressBar progressBar;

    public ProcessItemView(Context context) {
        this(context, null);
    }

    public ProcessItemView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, -1);
    }

    public ProcessItemView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }

    private void initView() {
        View view = View.inflate(getContext(), R.layout.layout_process_item_view, null);
        addView(view);
        tvLeft = view.findViewById(R.id.tv_left);
        tvMiddle = view.findViewById(R.id.tv_middle);
        tvRight = view.findViewById(R.id.tv_right);
        progressBar = view.findViewById(R.id.progressBar);
    }

    public void setLeftText(String leftText) {
        tvLeft.setText(leftText);
    }

    public void setRightText(String rightText) {
        tvRight.setText(rightText);
    }

    public void setMiddleText(String middleText) {
        tvMiddle.setText(middleText);
    }

    public void setProgressBar(int progress) {
        progressBar.setProgress(progress);
    }
}
