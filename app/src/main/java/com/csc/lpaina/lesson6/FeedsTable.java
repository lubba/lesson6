package com.csc.lpaina.lesson6;

import android.provider.BaseColumns;

interface FeedsTable extends BaseColumns {
    String TABLE_NAME = "todo";

    String COLUMN_TITLE = "title";
    String COLUMN_DESCRIPTION = "description";
    String COLUMN_RANGE = "range";
    String COLUMN_STATUS = "status";
}
