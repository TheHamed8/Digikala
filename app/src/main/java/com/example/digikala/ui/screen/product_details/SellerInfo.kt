package com.example.digikala.ui.screen.product_details

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.digikala.R
import com.example.digikala.ui.screen.basket.DetailRow
import com.example.digikala.ui.theme.DarkCyan
import com.example.digikala.ui.theme.DigikalaLightGreen
import com.example.digikala.ui.theme.DigikalaLightRed
import com.example.digikala.ui.theme.darkText
import com.example.digikala.ui.theme.extraSmall
import com.example.digikala.ui.theme.grayCategory
import com.example.digikala.ui.theme.roundedShape
import com.example.digikala.ui.theme.semiDarkText
import com.example.digikala.ui.theme.spacing
import com.example.digikala.ui.theme.unSelectedBottomBar

@Composable
fun SellerInfo() {
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
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(
                vertical = MaterialTheme.spacing.small,
                horizontal = MaterialTheme.spacing.medium,
            )
    ) {
        Spacer(modifier = Modifier.height(MaterialTheme.spacing.extraSmall))

        Text(
            text = stringResource(id = R.string.seller),
            style = MaterialTheme.typography.h4,
            color = MaterialTheme.colors.darkText,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = MaterialTheme.spacing.small)
        )

        Spacer(modifier = Modifier.width(MaterialTheme.spacing.small))

        Row(
            modifier = Modifier.padding(
                start = MaterialTheme.spacing.small,
                top = MaterialTheme.spacing.small,
                end = MaterialTheme.spacing.small
            ),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.digi_logo),
                contentDescription = "",
                modifier = Modifier
                    .size(25.dp)
                    .clip(MaterialTheme.roundedShape.small)
            )
            Spacer(modifier = Modifier.width(MaterialTheme.spacing.medium))

            Column {
                Text(
                    text = stringResource(id = R.string.digikala),
                    style = MaterialTheme.typography.h5,
                    color = MaterialTheme.colors.darkText
                )
                Spacer(modifier = Modifier.height(MaterialTheme.spacing.small))

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "",
                        style = MaterialTheme.typography.h6,
                        color = MaterialTheme.colors.semiDarkText
                    )
                }
                Spacer(
                    modifier = Modifier
                        .padding(top = MaterialTheme.spacing.small)
                        .fillMaxWidth()
                        .height(1.dp)
                        .background(MaterialTheme.colors.grayCategory)
                )


            }
        }
        Row(
            modifier = Modifier.padding(
                bottom = MaterialTheme.spacing.semiMedium,
                start = MaterialTheme.spacing.small,
                end = MaterialTheme.spacing.small
            ),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.guarantee),
                modifier = Modifier
                    .padding(bottom = MaterialTheme.spacing.small)
                    .size(25.dp)
                    .clip(MaterialTheme.roundedShape.small), contentDescription = ""
            )

            Spacer(modifier = Modifier.width(MaterialTheme.spacing.medium))

            Column {
                Text(
                    modifier = Modifier
                        .padding(vertical = MaterialTheme.spacing.small),
                    text = stringResource(id = R.string.productWarranty),
                    style = MaterialTheme.typography.h5,
                    color = MaterialTheme.colors.darkText,
                )
                Spacer(
                    modifier = Modifier
                        .padding(top = MaterialTheme.spacing.small)
                        .fillMaxWidth()
                        .height(1.dp)
                        .background(MaterialTheme.colors.grayCategory)
                )
            }

        }


        Row(modifier = Modifier.padding(horizontal = MaterialTheme.spacing.biggerSmall)) {

            Column(
                modifier = Modifier
                    .width(16.dp)
                    .fillMaxHeight()
                    .padding(vertical = MaterialTheme.spacing.small),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.in_stock),
                    contentDescription = "",
                    modifier = Modifier.size(16.dp),
                    tint = MaterialTheme.colors.DarkCyan
                )

                Divider(
                    Modifier
                        .width(2.dp)
                        .height(16.dp)
                        .alpha(0.6f),
                    color = Color.LightGray
                )

                Icon(
                    painter = painterResource(id = R.drawable.circle),
                    contentDescription = "",
                    modifier = Modifier
                        .size(10.dp)
                        .padding(1.dp),
                    tint = MaterialTheme.colors.DarkCyan
                )
                Divider(
                    Modifier
                        .width(2.dp)
                        .height(16.dp)
                        .alpha(0.6f),
                    color = Color.LightGray
                )

                Icon(
                    painter = painterResource(id = R.drawable.circle),
                    contentDescription = "",
                    modifier = Modifier
                        .size(10.dp)
                        .padding(1.dp),
                    tint = MaterialTheme.colors.DarkCyan
                )

            }

            Column(modifier = Modifier.padding(horizontal = MaterialTheme.spacing.biggerMedium)) {

                Text(
                    text = stringResource(id = R.string.in_digi_stock),
                    style = MaterialTheme.typography.h6,
                    color = MaterialTheme.colors.semiDarkText,
                    modifier = Modifier
                        .padding(vertical = MaterialTheme.spacing.extraSmall)
                )


                DetailRow(
                    icon = painterResource(id = R.drawable.k1),
                    text = stringResource(id = R.string.digikala_send),
                    color = MaterialTheme.colors.DigikalaLightRed,
                    fontStyle = MaterialTheme.typography.extraSmall
                )
                DetailRow(
                    icon = painterResource(id = R.drawable.k2),
                    text = stringResource(id = R.string.fast_send),
                    color = MaterialTheme.colors.DigikalaLightGreen,
                    fontStyle = MaterialTheme.typography.extraSmall
                )

            }

        }

        Spacer(
            modifier = Modifier
                .padding(top = MaterialTheme.spacing.small)
                .fillMaxWidth()
                .height(1.dp)
                .background(MaterialTheme.colors.grayCategory)
        )

        Row(
            modifier = Modifier.padding(
                horizontal = MaterialTheme.spacing.small
            ),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.digi_score),
                modifier = Modifier
                    .size(20.dp)
                    .clip(MaterialTheme.roundedShape.small), contentDescription = ""
            )

            Spacer(modifier = Modifier.width(MaterialTheme.spacing.medium))

            Column {
                Text(
                    modifier = Modifier
                        .padding(vertical = MaterialTheme.spacing.small),
                    text = stringResource(id = R.string.digiclub_get_score),
                    style = MaterialTheme.typography.h5,
                    color = MaterialTheme.colors.darkText,
                )

            }

        }


        Spacer(
            modifier = Modifier
                .padding(top = MaterialTheme.spacing.small)
                .fillMaxWidth()
                .height(1.dp)
                .background(MaterialTheme.colors.grayCategory)
        )

        Row(
            modifier = Modifier.padding(
                bottom = MaterialTheme.spacing.small,
                start = MaterialTheme.spacing.small,
                end = MaterialTheme.spacing.small
            ),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.info),
                modifier = Modifier
                    .size(20.dp)
                    .clip(MaterialTheme.roundedShape.small), contentDescription = ""
            )

            Spacer(modifier = Modifier.width(MaterialTheme.spacing.medium))

            Column {
                Text(
                    modifier = Modifier
                        .padding(vertical = MaterialTheme.spacing.small),
                    text = "${stringResource(id = R.string.manufacturer_price)} 111" +
                            " ${stringResource(id = R.string.toman)}",
                    style = MaterialTheme.typography.h5,
                    color = MaterialTheme.colors.unSelectedBottomBar,
                )
            }

        }


        Row(
            modifier = Modifier
                .padding(
                    top = MaterialTheme.spacing.small,
                    start = MaterialTheme.spacing.small,
                    end = MaterialTheme.spacing.small
                )
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {
            Text(
                text = stringResource(id = R.string.better_price_suggestion),
                style = MaterialTheme.typography.extraSmall,
                color = MaterialTheme.colors.unSelectedBottomBar
            )
            Image(
                painter = painterResource(id = R.drawable.mark),
                contentDescription = "",
                modifier = Modifier.size(25.dp)
            )

        }

    }


}