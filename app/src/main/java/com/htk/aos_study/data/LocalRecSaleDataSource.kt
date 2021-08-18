package com.htk.aos_study.data

import com.htk.aos_study.R
import com.htk.aos_study.ui.view.home.model.RecSaleInfo

class LocalRecSaleDataSource: RecSaleDataSource {
    override fun fetchData(): MutableList<RecSaleInfo> {
        return mutableListOf(
            RecSaleInfo(
                recSaleImage = R.drawable.theme_rectangle
            ),
            RecSaleInfo(
                recSaleImage = R.drawable.theme_rectangle
            ),
            RecSaleInfo(
                recSaleImage = R.drawable.theme_rectangle
            ),
            RecSaleInfo(
                recSaleImage = R.drawable.theme_rectangle
            )
        )
    }
}