package es.kreandos.androidapp.kbaby_free.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class PacienteSQLiteHelper extends SQLiteOpenHelper {
 
    //Sentencia SQL para crear la tabla de Usuarios
/*************************************************************************
 * ATENCIÓN!!!!!: POR MODIFICAR
 * ***********************************************************************
 */
    String sqlCreate = "CREATE TABLE Pacientes (cod_usu INTEGER, cod_pac INTEGER nombre TEXT,"
    		+ "apellidos TEXT, parentesco TEXT, otro_dato TEXT)";
 /***********************************************************************
  * 
  * @param contexto
  * @param nombre
  * @param factory
  * @param version
  */
    public PacienteSQLiteHelper(Context contexto, String nombre,
                               CursorFactory factory, int version) {
        super(contexto, nombre, factory, version);
    }
 
    @Override
    public void onCreate(SQLiteDatabase db) {
        //Se ejecuta la sentencia SQL de creación de la tabla
        db.execSQL(sqlCreate);
    }
 
    @Override
    public void onUpgrade(SQLiteDatabase db, int versionAnterior, int versionNueva) {
        //NOTA: Por simplicidad del ejemplo aqui utilizamos directamente la opción de
        //      eliminar la tabla anterior y crearla de nuevo vacía con el nuevo formato.
        //      Sin embargo lo normal serçia que haya que migrar datos de la tabla antigua
        //      a la nueva, por lo que este método debería ser más elaborado.
 
        //Se elimina la versión anterior de la tabla
        db.execSQL("DROP TABLE IF EXISTS Pacientes");
 
        //Se crea la nueva versión de la tabla
        db.execSQL(sqlCreate);
    }
    
}