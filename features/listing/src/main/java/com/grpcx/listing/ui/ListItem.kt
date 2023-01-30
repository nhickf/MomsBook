package com.grpcx.listing.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material.Checkbox
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.OutlinedTextField
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.grpcx.listing.R


@Preview(showBackground = true)
@Composable
fun ListItemPreview() {
    ListItem()
}

@Composable
internal fun ListItem() {
    Row(
        modifier = Modifier
            .padding(vertical = 16.dp , horizontal = 8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Checkbox(checked = false, onCheckedChange = {})

        OutlinedTextField(
            modifier = Modifier.weight(1f).wrapContentHeight(),
            value = "Item Name",
            onValueChange = {}
        )

        OutlinedTextField(
            modifier = Modifier.weight(1f).wrapContentHeight(),
            value = "Item Name",
            onValueChange = {}
        )

        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                painter = painterResource(id = R.drawable.ic_close),
                contentDescription = "close item"
            )
        }
    }
}
