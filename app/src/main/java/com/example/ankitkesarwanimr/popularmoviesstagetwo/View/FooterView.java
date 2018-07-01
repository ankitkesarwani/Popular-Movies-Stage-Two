package com.example.ankitkesarwanimr.popularmoviesstagetwo.View;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.ankitkesarwanimr.popularmoviesstagetwo.Helper.Constants;
import com.example.ankitkesarwanimr.popularmoviesstagetwo.R;

/**
 * Modified by Ankit Kesarwani on 18/6/18.
 */
public class FooterView extends LinearLayout {
    private TextView textView;

    public FooterView(Context context) {
        this(context, null);
    }

    public FooterView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public FooterView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initialiseView(context);
    }

    private void initialiseView(Context context) {
        ViewGroup.LayoutParams parentLayoutParams = new ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        );
        setLayoutParams(parentLayoutParams);
        setGravity(Gravity.CENTER);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        int margin = (int) getResources().getDimension(R.dimen.progress_bar_margin);
        layoutParams.setMargins(margin, margin, margin, margin);

        textView = new TextView(context);
        textView.setLayoutParams(layoutParams);
        addView(textView);
    }

    public void setState(int state) {
        switch (state) {
            case Constants.LOADING: {
                textView.setText(getContext().getString(R.string.loading));
                setVisibility(VISIBLE);
                break;
            }

            case Constants.DONE: {
                setVisibility(INVISIBLE);
                break;
            }

            case Constants.NO_MORE: {
                textView.setText(getContext().getString(R.string.no_more));
                setVisibility(VISIBLE);
                break;
            }

            case Constants.NETWORK_ERROR: {
                textView.setText(getContext().getString(R.string.network_error_movie_list));
                setVisibility(VISIBLE);
                break;
            }

            case Constants.SERVER_ERROR: {
                textView.setText(getContext().getString(R.string.server_error));
                setVisibility(VISIBLE);
                break;
            }

            case Constants.LOADING_FAVORITES: {
                setVisibility(INVISIBLE);
                break;
            }

            case Constants.NONE: {
                textView.setText(getContext().getString(R.string.no_favorites));
                setVisibility(VISIBLE);
                break;
            }

            case Constants.CURSOR_ERROR: {
                textView.setText(getContext().getString(R.string.cursor_error));
                setVisibility(VISIBLE);
                break;
            }
        }
    }
}
