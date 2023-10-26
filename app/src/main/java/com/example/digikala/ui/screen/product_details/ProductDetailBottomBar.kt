package com.example.digikala.ui.screen.product_details

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.digikala.R
import com.example.digikala.data.model.product_detail.ProductDetail
import com.example.digikala.ui.component.currentLogoChangeByLanguage
import com.example.digikala.ui.theme.DigikalaDarkRed
import com.example.digikala.ui.theme.bottomBar
import com.example.digikala.ui.theme.digikalaRed
import com.example.digikala.ui.theme.elevation
import com.example.digikala.ui.theme.roundedShape
import com.example.digikala.ui.theme.spacing
import com.example.digikala.utils.Constants
import com.example.digikala.utils.DigitHelper
import com.example.digikala.utils.DigitHelper.applyDiscount

@Composable
fun ProductDetailBottomBar(
    item: ProductDetail,
    navController: NavController
) {

    var price = 0L
    item.price?.let {
        price = it
    }
    var discountPercent = 0
    item.discountPercent?.let {
        discountPercent = it
    }

    BottomNavigation(
        backgroundColor = MaterialTheme.colors.bottomBar,
        elevation = MaterialTheme.elevation.small,
        modifier = Modifier.height(70.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    horizontal = MaterialTheme.spacing.medium,
                    vertical = MaterialTheme.spacing.biggerSmall
                ),
            verticalAlignment = CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.digikalaRed),
                shape = MaterialTheme.roundedShape.small
            ) {
                Text(
                    text = stringResource(id = R.string.add_to_basket),
                    style = MaterialTheme.typography.h5,
                    color = Color.White,
                    modifier = Modifier.padding(vertical = MaterialTheme.spacing.extraSmall)
                )

            }

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Row {
                    Box(
                        modifier = Modifier
                            .background(
                                color = MaterialTheme.colors.DigikalaDarkRed,
                                shape = CircleShape
                            )
                            .wrapContentHeight(CenterVertically)
                            .wrapContentWidth(CenterHorizontally)
                    ) {
                        Text(
                            text = "${DigitHelper.digitByLocate(discountPercent.toString())}%",
                            style = MaterialTheme.typography.h6,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(horizontal = MaterialTheme.spacing.small)
                        )
                    }
                    Spacer(modifier = Modifier.padding(horizontal = MaterialTheme.spacing.extraSmall))

                    Text(
                        text = DigitHelper.digitByLocateAndSeparator(price.toString()),
                        style = MaterialTheme.typography.body2,
                        color = Color.Gray,
                        textDecoration = TextDecoration.LineThrough
                    )

                }

                Row {
                    Text(
                        text = DigitHelper.digitByLocateAndSeparator(
                            applyDiscount(
                                price,
                                discountPercent
                            ).toString()
                        ),
                        style = MaterialTheme.typography.body1,
                        fontWeight = FontWeight.SemiBold
                    )

                    Image(
                        painter = currentLogoChangeByLanguage(),
                        contentDescription = "",
                        modifier = Modifier
                            .size(MaterialTheme.spacing.semiLarge)
                            .padding(horizontal = MaterialTheme.spacing.extraSmall)
                    )

                }
            }

        }

    }

}
