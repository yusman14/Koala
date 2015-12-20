package id.management.jagauang;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.content.ContentValues;
import android.database.Cursor;
import android.test.AndroidTestCase;
import id.management.jagauang.DatabaseManager;

/**
 * Created by ASUS on 12/13/2015.
 */
public class DatabaseManagerTest extends AndroidTestCase {
    private static int id;
    private static String waktu;
    private static String uraian;
    private static int jumlah;
    private static long isiDatabase;

    public void testDropDB(){
        assertTrue(mContext.deleteDatabase(DatabaseManager.NAMA_DB));
    }


    public void testCreateDB(){

        DatabaseManager.DatabaseOpenHelper data=new DatabaseManager.DatabaseOpenHelper(mContext);
        SQLiteDatabase db= data.getWritableDatabase();
        assertTrue(db.isOpen());
        db.close();
    }

    public void testInsertData(){
        DatabaseManager.DatabaseOpenHelper data  = new DatabaseManager.DatabaseOpenHelper(mContext);
        SQLiteDatabase db = data.getWritableDatabase();

        waktu = "2015-12-12 12:30";
        uraian = "jajan";
        jumlah =8000;

        ContentValues contentValues = new ContentValues();
        contentValues.put(DatabaseManager.,uraian);
        contentValues.put(DatabaseManager.ROW_HOBI2,jumlah);
        contentValues.put(DatabaseManager.ROW_TANGGAL2,waktu);

        isiDatabase = db.insert(DatabaseManager.NAMA_TABEL2, null, contentValues);
        assertTrue(isiDatabase != 0);

    }

}
