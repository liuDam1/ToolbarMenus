package es.etg.dam.pmdm.toolbarmenus.view

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import es.etg.dam.pmdm.toolbarmenus.R
import es.etg.dam.pmdm.toolbarmenus.data.MenuToolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        toolbar.setTitle(R.string.app_name)

        setSupportActionBar(toolbar)
    }

//    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        menuInflater.inflate(R.menu.menu_main, menu)
//        return true;
//    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        if(menu!=null) {

            for ((index, valor) in MenuToolbar.MENUS.withIndex()) {
                menu.add(Menu.NONE, index , Menu.NONE, valor)
            }
        }
        return true;
    }

//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        if(item.itemId == R.id.id_navegar){
//            navegar();
//            return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.toString() == getString(R.string.MENU_OPC_CERRAR)){
            navegar();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private fun navegar() {
        val text = "Has seleccionado Navegar"
        val toast = Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
    }
}