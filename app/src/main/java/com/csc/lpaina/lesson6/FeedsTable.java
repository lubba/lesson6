package com.csc.lpaina.lesson6;

import android.provider.BaseColumns;

interface FeedsTable extends BaseColumns {
    String TABLE_NAME = "todo";

    String COLUMN_TITLE = "tittle";
    String COLUMN_DESCRIPTION = "desscription";
    String COLUMN_RANGE = "range";
    String COLUMN_STATUS = "status";
}
