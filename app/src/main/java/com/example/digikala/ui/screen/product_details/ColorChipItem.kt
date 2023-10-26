package com.example.digikala.ui.screen.product_details

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.digikala.data.model.product_detail.ProductColor
import com.example.digikala.ui.theme.roundedShape
import com.example.digikala.ui.theme.spacing

@Composable
fun ColorChipItem(
    item: ProductColor
) {
    Surface(
        elevation = 1.dp,
        shape = MaterialTheme.roundedShape.biggerMedium,
        modifier = Modifier.padding(MaterialTheme.spacing.extraSmall)
    ) {
        Row(
            modifier = Modifier.padding(MaterialTheme.spacing.small),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Canvas(modifier = Modifier
                .size(20.dp)
                .border(1.dp, Color.Gray, CircleShape),
                onDraw = {
                    drawCircle(Color(("ff" + item.code.removePrefix("#").lowercase()).toLong(16)))
                }
            )
            Spacer(modifier = Modifier.width(MaterialTheme.spacing.small))

            Text(text = item.color, style = MaterialTheme.typography.h6)

        }
    }

}