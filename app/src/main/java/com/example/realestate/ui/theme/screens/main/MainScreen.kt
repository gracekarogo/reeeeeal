package com.example.wazitoecommerce.ui.theme.screens.main

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.Face
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.navigation.ROUT_MAIN
import com.example.wazitoecommerce.navigation.ROUT_SALES
import com.example.wazitoecommerce.ui.theme.Purple40
import com.example.wazitoecommerce.ui.theme.PurpleGrey40
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.navigation.ROUT_MPESA
import androidx.compose.foundation.layout.Column as Column


    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun MainScreen(navController:NavHostController){
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {


            var selected by remember { mutableIntStateOf(0) }
            Scaffold(
                bottomBar = {
                    NavigationBar {

                        bottomNavItems.forEachIndexed { index, bottomNavItem ->
                            NavigationBarItem(
                                selected = index == selected,
                                onClick = {
                                    selected = index
                                    navController.navigate(bottomNavItem.route)
                                },
                                icon = {
                                    BadgedBox(
                                        badge = {
                                            if (bottomNavItem.badges != 0) {
                                                Badge {
                                                    Text(text = bottomNavItem.badges.toString())
                                                }
                                            } else if (bottomNavItem.hasNews) {
                                                Badge()
                                            }
                                        }
                                    ) {
                                        Icon(imageVector =
                                        if (index == selected)
                                            bottomNavItem.selectedIcon
                                        else
                                            bottomNavItem.unselectedIcon,
                                            contentDescription = bottomNavItem.title)
                                    }

                                },
                                label = {
                                    Text(text = bottomNavItem.title)
                                })
                        }
                    }
                },


                floatingActionButton = {
                    FloatingActionButton(onClick = { /*TODO*/ }) {
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(imageVector = Icons.Default.Add,
                                contentDescription = "menu")
                        }
                    }
                },
                //Content Section
                content = @Composable{
                    Column(
                        modifier = Modifier.fillMaxSize()

                    ){


                        // start of TopAppBar
                        TopAppBar(title = {
                            Text(
                                text = "Garrandeur homes",
                                color = Color.Black,
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Bold

                            )
                        })

                        // End of TopAppBar
                        Spacer(modifier = Modifier.height(10.dp))
                        Row(
                            modifier = Modifier
                                .horizontalScroll(rememberScrollState())
                        ) {
                            Spacer(modifier = Modifier.width(10.dp))

                            Card(
                                elevation = CardDefaults.cardElevation(10.dp),

                                modifier = Modifier.clickable {
                                    navController.navigate(route = ROUT_MPESA )
                                }
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.home3),
                                    contentDescription = "house",
                                    modifier = Modifier.size(width = 300.dp, height = 200.dp),
                                    contentScale = ContentScale.Crop
                                )
                                Text(text = "4brd house")
                                Text(
                                    text = "Ksh 6,450,000",
                                    color = Color.Gray,
                                    fontFamily = FontFamily.Cursive
                                )
                            }






                            Spacer(modifier = Modifier.width(10.dp))
                            //Start of column1

                            Card (
                                elevation = CardDefaults.cardElevation(10.dp),

                                modifier = Modifier.clickable {
                                    navController.navigate(route = ROUT_MPESA)
                                }
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.h2),
                                    contentDescription = "house",
                                    modifier = Modifier.size(width = 300.dp, height = 200.dp),
                                    contentScale = ContentScale.Crop
                                )
                                Text(text = "5brd house")
                                Text(
                                    text = "Ksh 9,450,000",
                                    color = Color.Gray,
                                    fontFamily = FontFamily.Cursive
                                )
                            }


                            //Start of column1

                            Card (
                                elevation = CardDefaults.cardElevation(10.dp),

                                modifier = Modifier.clickable {
                                    navController.navigate(route = ROUT_MPESA )
                                }
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.house6),
                                    contentDescription = "",
                                    modifier = Modifier.size(width = 300.dp, height = 200.dp),
                                    contentScale = ContentScale.Crop
                                )
                                Text(text = "6brd house")
                                Text(
                                    text = "Ksh 7,450,000",
                                    color = Color.Gray,
                                    fontFamily = FontFamily.Cursive
                                )
                            }
                        }





                        Spacer(modifier = Modifier.height(10.dp))
                        Row {
                            Text(
                                text = "Recommended",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold
                            )

                        }


                        //start of row 1
                        Row(
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            //Start of column1
                            Column(
                                modifier = Modifier
                                    .padding(start = 5.dp)
                            ) {
                                Card (
                                    elevation = CardDefaults.cardElevation(10.dp),

                                    modifier = Modifier.clickable {
                                        navController.navigate(route = ROUT_MPESA)
                                    }
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.house6),
                                        contentDescription = "house",
                                        modifier = Modifier.size(width = 180.dp, height = 140.dp),
                                        contentScale = ContentScale.Crop
                                    )
                                }

                                Text(text = "2brd house")
                                Text(
                                    text = "Ksh 2,450,000",
                                    color = Color.Gray,
                                    fontFamily = FontFamily.Cursive
                                )

                                Row {
                                    OutlinedButton(onClick = { /*TODO*/ }) {
                                        Text(text = "Buy", color = Color.Black)
                                    }


                                OutlinedButton(onClick = { /*TODO*/ }) {
                                    Text(text = "CALL", color = Color.Black)
                                }

                                }

                            }
                            //Start of column2
                            Column(
                                modifier = Modifier
                                    .padding(start = 20.dp)
                            ) {
                                Card(
                                    elevation = CardDefaults.cardElevation(10.dp),

                                    modifier = Modifier.clickable {
                                        navController.navigate(route = ROUT_MPESA )
                                    }
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.home3),
                                        contentDescription = "house",
                                        modifier = Modifier.size(width = 180.dp, height = 140.dp),
                                        contentScale = ContentScale.Crop
                                    )
                                }

                                Text(text = "1brd house")

                                Text(
                                    text = "Ksh 1,450,000",
                                    color = Color.Gray,
                                    fontFamily = FontFamily.Cursive,
                                )
                                Row {
                                    OutlinedButton(onClick = { /*TODO*/ }) {
                                        Text(text = "Buy", color = Color.Black)
                                    }


                                    OutlinedButton(onClick = { /*TODO*/ }) {
                                        Text(text = "CALL", color = Color.Black)
                                    }

                                }


                            }

                        }
                        Spacer(modifier = Modifier.height(10.dp))

                        //start of row 2
                        Row(
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            //Start of column1
                            Column(
                                modifier = Modifier
                                    .padding(start = 5.dp)
                            ) {
                                Card (
                                    elevation = CardDefaults.cardElevation(10.dp),

                                    modifier = Modifier.clickable {
                                        navController.navigate(route = ROUT_MPESA )
                                    }
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.home2),
                                        contentDescription = "house",
                                        modifier = Modifier.size(width = 180.dp, height = 140.dp),
                                        contentScale = ContentScale.Crop
                                    )
                                }

                                Text(text = "2brd house")
                                Text(
                                    text = "Ksh 3,450,000",
                                    color = Color.Gray,
                                    fontFamily = FontFamily.Cursive
                                )
                                Row {
                                    OutlinedButton(onClick = { /*TODO*/ }) {
                                        Text(text = "Buy", color = Color.Black)
                                    }


                                    OutlinedButton(onClick = { /*TODO*/ }) {
                                        Text(text = "CALL", color = Color.Black)
                                    }

                                }


                            }
                            //Start of column2
                            Column(
                                modifier = Modifier
                                    .padding(start = 20.dp)
                            ) {
                                Card (
                                    elevation = CardDefaults.cardElevation(10.dp),

                                    modifier = Modifier.clickable {
                                        navController.navigate(route = ROUT_MPESA )
                                    }
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.home2),
                                        contentDescription = "house",
                                        modifier = Modifier.size(width = 180.dp, height = 140.dp),
                                        contentScale = ContentScale.Crop
                                    )
                                }

                                Text(text = "4brd house")

                                Text(
                                    text = "Ksh 5,450,000",
                                    color = Color.Gray,
                                    fontFamily = FontFamily.Cursive,
                                )
                                Row {
                                    OutlinedButton(onClick = { /*TODO*/ }) {
                                        Text(text = "Buy", color = Color.Black)
                                    }


                                    OutlinedButton(onClick = { /*TODO*/ }) {
                                        Text(text = "CALL", color = Color.Black)
                                    }

                                }


                            }

                        }
                        Spacer(modifier = Modifier.height(10.dp))

                        //start of row 3
                        Row(
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            //Start of column1
                            Column {

                                Card(
                                    elevation = CardDefaults.cardElevation(10.dp),

                                    modifier = Modifier.clickable {
                                        navController.navigate(route = ROUT_MPESA )
                                    }
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.home2),
                                        contentDescription = "house",
                                        modifier = Modifier.size(width = 180.dp, height = 140.dp),
                                        contentScale = ContentScale.Crop
                                    )
                                }

                                Text(text = "1brd house")
                                Text(
                                    text = "Ksh 2,450,000",
                                    color = Color.Gray,
                                    fontFamily = FontFamily.Cursive
                                )
                                Row {
                                    OutlinedButton(onClick = { /*TODO*/ }) {
                                        Text(text = "Buy", color = Color.Black)
                                    }


                                    OutlinedButton(onClick = { /*TODO*/ }) {
                                        Text(text = "CALL", color = Color.Black)
                                    }

                                }


                            }
                            //Start of column2
                            Column(
                                modifier = Modifier
                                    .padding(start = 20.dp)
                            ) {
                                Card (
                                    elevation = CardDefaults.cardElevation(10.dp),

                                    modifier = Modifier.clickable {
                                        navController.navigate(route = ROUT_MPESA )
                                    }
                                )
                                {
                                    Image(
                                        painter = painterResource(id = R.drawable.home2),
                                        contentDescription = "house",
                                        modifier = Modifier.size(width = 180.dp, height = 140.dp),
                                        contentScale = ContentScale.Crop
                                    )
                                }

                                Text(text = "4brd house")

                                Text(
                                    text = "Ksh 5,450,000",
                                    color = Color.Gray,
                                    fontFamily = FontFamily.Cursive,
                                )
                                Row {
                                    OutlinedButton(onClick = { /*TODO*/ }) {
                                        Text(text = "Buy", color = Color.Black)
                                    }


                                    OutlinedButton(onClick = { /*TODO*/ }) {
                                        Text(text = "CALL", color = Color.Black)
                                    }

                                }


                            }

                        }
                        Spacer(modifier = Modifier.height(10.dp))

                        //start of row 4
                        Row(
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            //Start of column1
                            Column(
                                modifier = Modifier
                                    .padding(start = 5.dp)
                            ) {
                                Card (
                                    elevation = CardDefaults.cardElevation(10.dp),
                                    modifier =  Modifier.clickable{
                                        navController.navigate(ROUT_MPESA)
                                    })
                                {
                                    Image(
                                        painter = painterResource(id = R.drawable.home2),
                                        contentDescription = "house",
                                        modifier = Modifier.size(width = 180.dp, height = 140.dp),
                                        contentScale = ContentScale.Crop
                                    )
                                }

                                Text(text = "1brd house")
                                Text(
                                    text = "2,440,000",
                                    color = Color.Gray,
                                    fontFamily = FontFamily.Cursive
                                )
                                Row {
                                    OutlinedButton(onClick = { /*TODO*/ }) {
                                        Text(text = "Buy", color = Color.Black)
                                    }


                                    OutlinedButton(onClick = { /*TODO*/ }) {
                                        Text(text = "CALL", color = Color.Black)
                                    }

                                }


                            }
                            //Start of column2
                            Column(
                                modifier = Modifier
                                    .padding(start = 20.dp)
                            ) {
                                Card (
                                    elevation = CardDefaults.cardElevation(10.dp),

                                    modifier = Modifier.clickable {
                                        navController.navigate(route = ROUT_MPESA )
                                    }
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.home2),
                                        contentDescription = "house",
                                        modifier = Modifier.size(width = 180.dp, height = 140.dp),
                                        contentScale = ContentScale.Crop
                                    )
                                }

                                Text(text = "7brd")

                                Text(
                                    text = "Ksh 10,450,000",
                                    color = Color.Gray,
                                    fontFamily = FontFamily.Cursive,
                                )

                            }

                        }

                    }

                }

            )

        }
    }



    val bottomNavItems = listOf(
        BottomNavItem(
            title = "Home",
            route="home",
            selectedIcon= Icons.Filled.Home,
            unselectedIcon= Icons.Outlined.Home,
            hasNews = false,
            badges=0
        ),



        BottomNavItem(
            title = "Rent",
            route="Rent",
            selectedIcon= Icons.Filled.Star,
            unselectedIcon= Icons.Outlined.Person,
            hasNews = true,
            badges=5
        ),

        BottomNavItem(
            title = "Sell",
            route="add_products",
            selectedIcon= Icons.Filled.ShoppingCart,
            unselectedIcon= Icons.Outlined.Face,
            hasNews = true,
            badges=1
        ),


        )



    data class BottomNavItem(
        val title :String,
        val route :String,
        val selectedIcon: ImageVector,
        val unselectedIcon : ImageVector,
        val hasNews :Boolean,
        val badges :Int
    )



    @Composable
    @Preview(showBackground = true)
    fun MainScreenPreview(){



            MainScreen(rememberNavController())

    }