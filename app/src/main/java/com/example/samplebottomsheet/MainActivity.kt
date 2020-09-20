package com.example.samplebottomsheet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import com.google.android.material.bottomsheet.BottomSheetBehavior
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.my_persistent_bottom_sheet.*

class MainActivity : AppCompatActivity() {

    private lateinit var bottomSheetBehavior: BottomSheetBehavior<LinearLayout>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomSheetBehavior = BottomSheetBehavior.from(my_bottomsheet)

        bottomSheetBehavior.addBottomSheetCallback(object :
            BottomSheetBehavior.BottomSheetCallback() {
            override fun onStateChanged(bottomSheet: View, newState: Int) {
                buttonpersistantsheet.text = when (newState) {
                    BottomSheetBehavior.STATE_EXPANDED -> "Close Persistant Buttom Sheet"
                    BottomSheetBehavior.STATE_COLLAPSED -> "Open Persistant Buttom Sheet"
                    else -> "Bottom Sheet State Changing"
                }
            }

            override fun onSlide(bottomSheet: View, slideOffset: Float) {

            }

        })

        buttonpersistantsheet.setOnClickListener {
            bottomSheetBehavior.state =
                if (bottomSheetBehavior.state == BottomSheetBehavior.STATE_EXPANDED)
                    BottomSheetBehavior.STATE_COLLAPSED else BottomSheetBehavior.STATE_EXPANDED

        }

        button_dialoc_sheet.setOnClickListener {
            MyDialocBottomSheet().show(
                supportFragmentManager, ""
            )
        }

    }


}