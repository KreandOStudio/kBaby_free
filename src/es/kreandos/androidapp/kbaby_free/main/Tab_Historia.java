package es.kreandos.androidapp.kbaby_free.main;

import es.kreandos.androidapp.kbaby_free.database.BD_Historia;
import es.kreandos.androidapp.kbaby_free.main.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class Tab_Historia extends Activity {
	private BD_Historia hBD = new BD_Historia();
	private static final int ACTIVITY_CREATE = 0;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab_historia);
	}
	// Creamos el menu desde el archivo XML
		@Override
		public boolean onCreateOptionsMenu(Menu menu) {
			MenuInflater inflater = getMenuInflater();
			inflater.inflate(R.menu.listmenu, menu);
			return true;
		}
		
		// Codificamos la accion al seleccionar el item del menu:
		@Override
		public boolean onMenuItemSelected(int featureId, MenuItem item) {
			switch (item.getItemId()) {
			case R.id.insert:
				createTodo();
				return true;
			}
			return super.onMenuItemSelected(featureId, item);
		}
		
		@Override
		public boolean onOptionsItemSelected(MenuItem item) {
			switch(item.getItemId()) {
			case R.id.insert:
				createTodo();
				return true;
			}
			return super.onOptionsItemSelected(item);
		}
		
		private void createTodo() {
			Intent i = new Intent(this, Details.class);
			startActivityForResult(i, ACTIVITY_CREATE);
		}
		public BD_Historia get_hBD() {
			return hBD;
		}
		public void set_hBD(BD_Historia hBD) {
			this.hBD = hBD;
		}
}
