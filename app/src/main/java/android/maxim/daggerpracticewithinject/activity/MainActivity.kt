package android.maxim.daggerpracticewithinject.activity

import android.maxim.daggerpracticewithinject.app.App
import android.maxim.daggerpracticewithinject.data.DatabaseHelper
import android.maxim.daggerpracticewithinject.data.NetworkUtils
import android.maxim.daggerpracticewithinject.R
import android.maxim.daggerpracticewithinject.di.DataBaseHelper
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject
import javax.inject.Named

class MainActivity : AppCompatActivity() {

    @Inject
    @DataBaseHelper
    lateinit var databaseHelper: DatabaseHelper

    @Inject
    @Named("something")
    lateinit var networkUtils: NetworkUtils

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as App).appComponent.injectMainActivity(this)

        databaseHelper.help()
        networkUtils.util()
    }
}