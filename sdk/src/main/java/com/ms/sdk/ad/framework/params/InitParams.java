package com.ms.sdk.ad.framework.params;

import android.content.Context;

public class InitParams extends BaseParams {


    private Context context;

    public static Builder builder() {
        return new Builder();
    }


    public static class Builder {
        InitParams initParams;

        public Builder() {
            initParams = new InitParams();
        }

        public Builder context(Context context) {
            initParams.context = context;
            return this;
        }


        public InitParams build() {
            return initParams;
        }
    }
}
