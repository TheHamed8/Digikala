package com.example.digikala.ui.screen.category

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import com.example.digikala.R
import com.example.digikala.data.model.category.Sub
import com.example.digikala.data.model.home.Category
import com.example.digikala.ui.theme.DarkCyan
import com.example.digikala.ui.theme.LightCyan
import com.example.digikala.ui.theme.spacing

@Composable
fun CategoryItem(
    title: String, subList: List<Sub>
) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                top = MaterialTheme.spacing.medium,
                bottom = MaterialTheme.spacing.small,
                start = MaterialTheme.spacing.small,
                end = MaterialTheme.spacing.small,
            ),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Text(
            text = title,
            style = MaterialTheme.typography.h3,
            fontWeight = FontWeight.Bold
        )

        Text(
            modifier = Modifier.padding(horizontal = MaterialTheme.spacing.small),
            text = stringResource(id = R.string.see_all),
            style = MaterialTheme.typography.h5,
            color = MaterialTheme.colors.LightCyan
        )

    }

    LazyRow() {
        items(subList) { list ->
            SubCategoryItem(item = list)
        }
    }

}