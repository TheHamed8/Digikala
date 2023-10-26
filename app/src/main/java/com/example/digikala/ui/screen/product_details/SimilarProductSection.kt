package com.example.digikala.ui.screen.product_details

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.digikala.R
import com.example.digikala.data.model.home.AmazingItems
import com.example.digikala.data.remote.NetworkResult
import com.example.digikala.ui.screen.home.MostFavoriteProductOffer
import com.example.digikala.ui.screen.home.MostFavoriteProductShowMoreOffer
import com.example.digikala.ui.theme.DarkCyan
import com.example.digikala.ui.theme.darkText
import com.example.digikala.ui.theme.spacing
import com.example.digikala.viewModel.HomeViewModel
import com.example.digikala.viewModel.ProductDetailViewModel
import kotlinx.coroutines.flow.collectLatest

@Composable
fun SimilarProductSection(
    categoryId: String,
    viewModel: ProductDetailViewModel = hiltViewModel()
) {

    var similarList by remember {
        mutableStateOf<List<AmazingItems>>(emptyList())
    }

    var loading by remember {
        mutableStateOf(false)
    }

    viewModel.getSimilarProducts(categoryId)
    LaunchedEffect(true) {
        viewModel.similarProduct.collectLatest { similarResult ->
            when (similarResult) {
                is NetworkResult.Success -> {
                    similarList = similarResult.data ?: emptyList()
                    loading = false
                }

                is NetworkResult.Error -> {
                    loading = false
                    Log.e("1212", "Similar Product Section has a issue: ${similarResult.message}")
                }

                is NetworkResult.Loading -> {
                    loading = true
                }
            }
        }

    }

    Divider(
        modifier = Modifier
            .fillMaxWidth()
            .height(MaterialTheme.spacing.small)
            .alpha(0.4f)
            .shadow(2.dp),
        color = Color.LightGray,
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(MaterialTheme.spacing.small)
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = MaterialTheme.spacing.extraSmall),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(
                text = stringResource(id = R.string.similar_product),
                textAlign = TextAlign.Start,
                style = MaterialTheme.typography.h3,
                fontWeight = FontWeight.SemiBold,
                color = MaterialTheme.colors.darkText,
            )

        }


        LazyRow {
            items(similarList) { item ->
                MostFavoriteProductOffer(item)
            }
            item {
                MostFavoriteProductShowMoreOffer()
            }
        }

    }


}