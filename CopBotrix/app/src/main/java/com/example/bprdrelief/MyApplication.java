package com.example.bprdrelief;

import android.app.Application;

import com.zoho.salesiqembed.ZohoSalesIQ;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ZohoSalesIQ.init(this, "JM4QeihIl3zUA38s%2Fz9JCdNDC9Ajmxt5J1YRotuhQJDeh3%2F0hvSx8CyTm%2BwHDCPz_in", "VXYedrQX8Sm9FQa1mgqpthNGgM2kP2uupcIS19W7gldgHFhjksIjVV0XwXfZCUgdv%2BqriXODB9cMxFeXK5W8U%2BrMCnmuYuBrFjJbBzRlLXPadSrVBdzpgvm0CQ6sSTLUsVDTYN34vR%2FvoOZiMzciVnKKfdqRjKSh");
    }
}
