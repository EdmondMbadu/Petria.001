package com.example.chilldrenofpatria;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHandler extends SQLiteOpenHelper {

    // initialize constants for DB version and name
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "petria.db";

    // initialize constants for shoppinglist table
    public static final String TABLE_CHAPTER1 = "chapter1";
    public static final String COLUMN_CHAPTER1_ID = "_id";
    public static final String COLUMN_CHAPTER1_HEALTH = "health";
    public static final String COLUMN_CHAPTER1_SPELL_SLOTS = "spell_slots";
    // this is an ingenious piece of code
    // because I am saving the hierarchy of classes on the database
    // in a string
    public static final String COLUMN_CHAPTER1_LAST_CLASSE = "last";
    public static final String COLUMN_CHAPTER1_BEFORE_LAST = "before_last";


//    public static final String COLUMN_CONTACT_TYPE = "type";
//    public static final String COLUMN_CONTACT_DATE= "date";


    /**
     * Initializes a DBHandler.  Creates version of the database.
     *
     * @param context reference to activity that initializes the DBHandler
     * @param factory null
     */
    public DBHandler(Context context, SQLiteDatabase.CursorFactory factory) {
        // call superclass constructor
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    /**
     * Creates database tables
     *
     * @param sqLiteDatabase reference to shopper database
     */
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        // define create statement for shopping list table
        String query = "CREATE TABLE " + TABLE_CHAPTER1 + "(" +
                COLUMN_CHAPTER1_ID + " INTEGER PRIMARY KEY , " +
                COLUMN_CHAPTER1_HEALTH + " INTEGER," +
                COLUMN_CHAPTER1_SPELL_SLOTS + " INTEGER," +
                COLUMN_CHAPTER1_LAST_CLASSE + " TEXT, " +
                COLUMN_CHAPTER1_BEFORE_LAST+" TEXT"+
                ");";

        // execute create statement
        sqLiteDatabase.execSQL(query);


    }

    /**
     * This method gets executed when a new version of the database is initialized.
     *
     * @param sqLiteDatabase reference to shopper database
     * @param oldVersion     old version of database
     * @param newVersion     new version of database
     */
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        // execute drop statement that drops shopping list table
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_CHAPTER1);

        // execute drop statement that drops shopping list item table

        // call method that creates tables
        onCreate(sqLiteDatabase);
    }

    /**
     * This method gets called when the add Item in the CreateList Menu gets clicked.
     * It inserts a new row in the shopping list table.
     *
     * @param name  shopping list name
     * @param store shopping list store
     * @param date  shopping list date
     */
    public boolean addChapter(int health, int spell_slots, String last,String before) {

        // get reference to shopper database.  This method calls onUpgrade
        // and onCreate.
        SQLiteDatabase db = getWritableDatabase();

        // initialize an empty ContentValues
        ContentValues values = new ContentValues();

        // put key-value pairs in ContentValues.  The key must be the name
        // of a column and the value is the value to be inserted in the column.
        values.put(COLUMN_CHAPTER1_HEALTH, health);
        values.put(COLUMN_CHAPTER1_SPELL_SLOTS, spell_slots);
        values.put(COLUMN_CHAPTER1_LAST_CLASSE, last);
        values.put(COLUMN_CHAPTER1_BEFORE_LAST, before);
//        values.put(COLUMN_CONTACT_TYPE, type);
//        values.put(COLUMN_CONTACT_DATE, date);

        // insert values into shopping list table
        long result = db.insert(TABLE_CHAPTER1, null, values);

        // close reference to shopper database
        db.close();
        if (result == -1)
            return false;
        else
            return true;
    }

    public boolean updateChapter(String id, int health, int spell_slots, String last, String before) {

        // get reference to shopper database.  This method calls onUpgrade
        // and onCreate.
        SQLiteDatabase db = getWritableDatabase();

        // initialize an empty ContentValues
        ContentValues values = new ContentValues();

//        db.update(TABLE_NAME, contentValues, "ID = ?",new String[] { id });

        // put key-value pairs in ContentValues.  The key must be the name
        // of a column and the value is the value to be inserted in the column.
        values.put(COLUMN_CHAPTER1_ID, id);
        values.put(COLUMN_CHAPTER1_HEALTH, health);
        values.put(COLUMN_CHAPTER1_SPELL_SLOTS, spell_slots);
        values.put(COLUMN_CHAPTER1_LAST_CLASSE, last);
        values.put(COLUMN_CHAPTER1_BEFORE_LAST, before);
////        values.put(COLUMN_CONTACT_TYPE, type);
//        values.put(COLUMN_CONTACT_DATE, date);

        // insert values into shopping list table
       long result= db.update(TABLE_CHAPTER1, values, "_id= ?", new String[]{id});

        // close reference to shopper database
        db.close();
//        return true;
        if (result == -1)
            return false;
        else
            return true;
    }

    /**
     * This method gets called when the Main activity is created.
     *
     * @return Cursor that contains all rows in shopping list table
     */
    public Cursor getChapther1() {

        // get reference to shopper database.  This method calls onUpgrade
        // and onCreate.
        SQLiteDatabase db = getWritableDatabase();

        // execute select statement that selects all rows from the shopping list
        // table and return it as a Cursor
        return db.rawQuery("SELECT * FROM " + TABLE_CHAPTER1, null);
    }

    /**
     * This method gets called when the ViewList activity is created.
     *
     * @param id shopping list id
     * @return shopping list name
     */
    public int getHealth(int id) {

        // get reference to shopper database.  This method calls onUpgrade
        // and onCreate.
        SQLiteDatabase db = getWritableDatabase();

        // initialize String that will be returned by method to an empty String
        int dbhealth = 0;

        // define select statement that will select everything from shopping list table
        // for the specified shopping list id
        String query = "SELECT * FROM " + TABLE_CHAPTER1 +
                " WHERE " + COLUMN_CHAPTER1_HEALTH + " = " + id;

        // execute select statement and store it in a Cursor
        Cursor cursor = db.rawQuery(query, null);

        // move to the first row in the Cursor
        cursor.moveToFirst();

        // get the String in the name column of the Cursor and check if it's not null
        if ((cursor.getInt(cursor.getColumnIndex("health")) >= 0)) {
            // get the String in the name column of the Cursor and store it in
            // the String that will be returned
            dbhealth = cursor.getInt(cursor.getColumnIndex("health"));
        }

        // close reference to shopper database
        db.close();

        // return shopping list name
        return dbhealth;
    }

    public int getSpell(int id) {

        // get reference to shopper database.  This method calls onUpgrade
        // and onCreate.
        SQLiteDatabase db = getWritableDatabase();

        // initialize String that will be returned by method to an empty String
        int dbspell = 0;

        // define select statement that will select everything from shopping list table
        // for the specified shopping list id
        String query = "SELECT * FROM " + TABLE_CHAPTER1 +
                " WHERE " + COLUMN_CHAPTER1_SPELL_SLOTS + " = " + id;

        // execute select statement and store it in a Cursor
        Cursor cursor = db.rawQuery(query, null);

        // move to the first row in the Cursor
        cursor.moveToFirst();

        // get the String in the name column of the Cursor and check if it's not null
        if ((cursor.getInt(cursor.getColumnIndex("spell_slots")) >= 0)) {
            // get the String in the name column of the Cursor and store it in
            // the String that will be returned
            dbspell = cursor.getInt(cursor.getColumnIndex("spell_slots"));
        }

        // close reference to shopper database
        db.close();

        // return shopping list name
        return dbspell;
    }

    public String getLastClass(int id) {

        // get reference to shopper database.  This method calls onUpgrade
        // and onCreate.
        SQLiteDatabase db = getWritableDatabase();

        // initialize String that will be returned by method to an empty String
        String dbClasses = "";

        // define select statement that will select everything from shopping list table
        // for the specified shopping list id
        String query = "SELECT * FROM " + TABLE_CHAPTER1 +
                " WHERE " + COLUMN_CHAPTER1_LAST_CLASSE + " = " + id;

        // execute select statement and store it in a Cursor
        Cursor cursor = db.rawQuery(query, null);

        // move to the first row in the Cursor
        cursor.moveToFirst();

        // get the String in the name column of the Cursor and check if it's not null
        if ((cursor.getString(cursor.getColumnIndex("last")) != null)) {
            // get the String in the name column of the Cursor and store it in
            // the String that will be returned
            dbClasses = cursor.getString(cursor.getColumnIndex("last"));
        }

        // close reference to shopper database
        db.close();

        // return shopping list name
        return dbClasses;
    }
    public String getBeforeLast(int id) {

        // get reference to shopper database.  This method calls onUpgrade
        // and onCreate.
        SQLiteDatabase db = getWritableDatabase();

        // initialize String that will be returned by method to an empty String
        String dbClasses = "";

        // define select statement that will select everything from shopping list table
        // for the specified shopping list id
        String query = "SELECT * FROM " + TABLE_CHAPTER1 +
                " WHERE " + COLUMN_CHAPTER1_BEFORE_LAST + " = " + id;

        // execute select statement and store it in a Cursor
        Cursor cursor = db.rawQuery(query, null);

        // move to the first row in the Cursor
        cursor.moveToFirst();

        // get the String in the name column of the Cursor and check if it's not null
        if ((cursor.getString(cursor.getColumnIndex("before_last")) != null)) {
            // get the String in the name column of the Cursor and store it in
            // the String that will be returned
            dbClasses = cursor.getString(cursor.getColumnIndex("before_last"));
        }

        // close reference to shopper database
        db.close();

        // return shopping list name
        return dbClasses;
    }

}