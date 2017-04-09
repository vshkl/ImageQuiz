package by.vshkl.android.imagequiz.database;

import com.raizlabs.android.dbflow.annotation.ConflictAction;
import com.raizlabs.android.dbflow.annotation.Database;

@Database(name = AppDatabase.NAME, version = AppDatabase.VERSION,
        insertConflict = ConflictAction.REPLACE, updateConflict = ConflictAction.REPLACE)
public class AppDatabase {

    public static final String NAME = "ImageQuizDb";

    public static final int VERSION = 1;
}
