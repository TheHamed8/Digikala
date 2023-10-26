package com.example.digikala.ui.screen.product_details

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import com.example.digikala.data.model.product_detail.ProductColor
import com.example.digikala.ui.theme.darkText
import com.example.digikala.ui.theme.spacing

@Composable
fun ProductSelectColor(
    colors: List<ProductColor>
) {
    Column(modifier = Modifier.padding(MaterialTheme.spacing.small)) {
        Text(
            text = "test",
            color = MaterialTheme.colors.darkText,
            modifier = Modifier.padding(MaterialTheme.spacing.small),
            style = MaterialTheme.typography.h4,
            fontWeight = FontWeight.Bold
        )

        LazyRow() {
            items(colors) { productColor ->
                ColorChipItem(productColor)
            }
        }

    }

}