package kr.sj.obap;

public class DBContract {
    public static final String TBL_USER ="USER_T ";
    public static final String COL_MID = "MEMBER_ID " ;
    public static final String COL_MPWD = "MEMBER_PWD " ;
    public static final String COL_NAME = "USER_NAME " ;
    public static final String COL_GEN = " USER_GEN ";
    public static final String COL_AGE = "USER_AGE ";
    public static final String COL_H   = " USER_HEIGHT ";
    public static final String COL_W   = " USER_WEIGHT ";

    public static final String TBL_USER_MEAL ="USER_MEAL_T ";
    public static final String COL_DATE = "DATE ";
    public static final String COL_TIME = "MEAL_TIME ";
    public static final String COL_FOODID = "MEAL_FOODID ";
    public static final String COL_FOODNUM = "MEAL_FOODNUM ";
    public static final String COL_FOODRATE = "MEAL_FOODRATE ";

    public static final String TBL_USER_NUTRIENT ="USER_NUTRIENT_T ";
    public static final String COL_CAL ="USER_CALORIE ";
    public static final String COL_CARBO = "USER_CARBOHVDRATE ";
    public static final String COL_PROTEIN = "USER_PROTEIN ";
    public static final String COL_FAT = "USER_FAT ";
    public static final String COL_VITAMIN = "USER_VITAMIN ";
    public static final String COL_DIETARY = "USER_DIETARY ";
    public static final String COL_SODIUM = "USER_SODIUM ";
    public static final String COL_CALCIUM = "USER_CALCIUM ";

    public static final String TBL_NUT_NEEDED ="NUT_NEEDED_T ";
    public static final String COL_NEED_AGE = "user_age ";
    public static final String COL_NEED_CAL = "day_calorie ";
    public static final String COL_NEED_PRO = "day_proteins ";
    public static final String COL_NEED_SOD = "day_sodium ";
    public static final String COL_NEED_CALCIUM = "day_calcium ";


    public static final String SQL_CREATE_USER_TBL = "CREATE TABLE IF NOT EXISTS USER_T (" +
            "_id integer primary key autoincrement," +
            COL_MID         + "TEXT," +
            COL_GEN         + "TEXT," +
            COL_AGE         + "INTEGER," +
            COL_H           + "REAL," +
            COL_W           + "REAL" +
            ")" ;

    public static final String SQL_CREATE_USER_MEAL_TBL = "CREATE TABLE IF NOT EXISTS USER_MEAL_T (" +
            "_id integer primary key autoincrement," +
            COL_DATE         + "INTEGER," +
            COL_TIME         + "TEXT," +
            COL_FOODID       + "INTEGER," +
            COL_FOODNUM      + "INTEGER," +
            COL_FOODRATE     + "REAL" +
            ")" ;

    public static final String SQL_CREATE_USER_NUTRIENT_TBL = "CREATE TABLE IF NOT EXISTS USER_NUTRIENT_T (" +
            COL_CAL         + "REAL," +
            COL_CARBO       + "REAL," +
            COL_PROTEIN     + "REAL," +
            COL_FAT         + "REAL," +
            COL_VITAMIN     + "REAL," +
            COL_DIETARY     + "REAL," +
            COL_SODIUM      + "REAL," +
            COL_CALCIUM     + "REAL" +
            ")" ;

    public static final String SQL_CREATE_NUT_NEEDED_TBL = "CREATE TABLE IF NOT EXISTS NUT_NEEDED_T (" +
            COL_NEED_AGE         + "INTEGER," +
            COL_NEED_CAL         + "REAL," +
            COL_NEED_PRO         + "REAL," +
            COL_NEED_SOD         + "REAL," +
            COL_NEED_CALCIUM     + "REAL" +
            ")" ;


    public static final String SQL_DROP_USER_TBL = "DROP TABLE IF EXISTS " + TBL_USER ;
    public static final String SQL_DROP_USER_MEAL_TBL = "DROP TABLE IF EXISTS " + TBL_USER_MEAL ;
    public static final String SQL_DROP_USER_NUTRIENT_TBL = "DROP TABLE IF EXISTS " + TBL_USER_NUTRIENT ;
    public static final String SQL_DROP_NUT_NEEDED_TBL = "DROP TABLE IF EXISTS " + TBL_NUT_NEEDED ;

    public static final String SQL_SELECT_USER = "SELECT * FROM " + TBL_USER ;
    public static final String SQL_SELECT_USER_MEAL = "SELECT * FROM " + TBL_USER_MEAL  ;
    public static final String SQL_SELECT_USER_NUTRIENT = "SELECT * FROM " + TBL_USER_NUTRIENT ;
    public static final String SQL_SELECT_NUT_NEED = "SELECT * FROM " + TBL_NUT_NEEDED ;

    public static final String SQL_DELETE = "DELETE FROM " + TBL_USER ;

    public static final String ADD_CVS_NUT_NEED_TBL = COL_NEED_AGE+", "+COL_NEED_CAL+", "+COL_NEED_PRO+", "+COL_NEED_SOD+", "+COL_NEED_CALCIUM;
}
