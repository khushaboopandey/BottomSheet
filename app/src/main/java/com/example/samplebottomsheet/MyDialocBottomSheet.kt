package com.example.samplebottomsheet

import android.os.Bundle
import android.view.ContextMenu
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.my_dialoc_bottom_sheet.*

class MyDialocBottomSheet : BottomSheetDialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = inflater.inflate(R.layout.my_dialoc_bottom_sheet, container, false)

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        list_items.adapter = ArrayAdapter<String>(
            requireContext(),
            android.R.layout.simple_list_item_1,
            listOf(
                "Item 1",
                "Item 2",
                "Item 3",
                "Item 4",
            )
        )

    }
}