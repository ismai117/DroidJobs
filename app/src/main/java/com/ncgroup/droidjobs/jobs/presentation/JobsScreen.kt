package com.ncgroup.droidjobs.jobs.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material.icons.outlined.Workspaces
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.SuggestionChip
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.ncgroup.droidjobs.R
import com.ncgroup.droidjobs.jobs.data.repository.JobsRepositoryImpl
import com.ncgroup.droidjobs.jobs.domain.model.Jobs
import com.ncgroup.droidjobs.utils.openUrl
import java.util.UUID


@Preview(showBackground = true)
@Composable
fun JobsScreenPreview() {
    JobsScreen(
        state = JobsState(
            allJobs = listOf(
                Jobs(
                    id = "f47ac10b-58cc-4372-a567-0e02b2c3d479",
                    title = "Android Engineer",
                    role = "Mobile Developer",
                    companyLogo = R.drawable.starling,
                    company = "Starling Bank",
                    companyMotto = "A better bank for everyone",
                    aboutUs = """
                Starling is a leading digital bank on a mission to disrupt the banking industry.

                Since our launch in 2014, we've surpassed 2 million accounts, including over 350,000 business accounts. Our total deposits, meanwhile, have topped £5 billion and we have lent over £2bn over the same period. We're a fully licensed UK bank, and we have the culture and spirit of a fast-moving, disruptive technology company. We've won the Best British Bank award four years running, and now employ over 1500 people across our London, Southampton, Cardiff & Dublin offices.

                Starling Bank is an equal opportunity employer, and we’re proud of our ongoing efforts to foster diversity & inclusion in the workplace. Individuals seeking employment at Starling Bank are considered without regard to race, religion, national origin, age, sex, gender, gender identity, gender expression, sexual orientation, marital status, medical condition, ancestry, physical or mental disability, military or veteran status, or any other characteristic protected by applicable law.

                By submitting your application, you agree that Starling Bank may collect your personal data for recruiting and related purposes. Our Privacy Notice explains what personal information we may process, where we may process your personal information, its purposes for processing your personal information, and the rights you can exercise over our use of your personal information.
            """.trimIndent(),
                    city = "London",
                    country = "UK",
                    address = "Finsbury Ave, London EC2M, UK",
                    industry = "FinTech · Banking · Finance",
                    description = """
                Starling engineers love building things, creating new stuff, learning new technologies and working with others across all areas of the business to bring brilliant products and features to life. We enjoy working with engineers who are excited about helping us deliver new features, regardless of what their primary tech stack may be. Hear from our engineers in our latest blogs or our case studies with Women in Tech.

                Our mobile engineers work in cross-functional feature teams arranged across broader engineering groups. You are empowered to make the decisions necessary for the platform and to provide insight to the team leads on such projects. You’ll also be working closely with other Android engineers with a variety of experience levels and interests, helping us improve and develop our Android app, CI automations and tooling. You’ll be committing, reviewing and shipping new code right from the first week! 🎉

                In the Starling Android application we are proud to be working with some of the latest technologies in the industry. When adopting new technologies we always consider as a team whether it’s the best choice for our product and our users. We have a strong collaborative and open culture here so you’ll find support outside your team too.
            """.trimIndent(),
                    experienceLevel = "Mid, Senior",
                    skills = listOf(
                        "Kotlin",
                        "Android",
                        "Java",
                        "Mobile Development",
                        "RxJava",
                        "API Security",
                        "AWS",
                        "Dagger",
                        "JUnit"
                    ),
                    salary = "Undisclosed",
                    companyBenefits = """
                - 33 days holiday (including flexible bank holidays)
                - An extra day’s holiday for your birthday
                - 16 hours paid volunteering time a year
                - Part-time and/or flexible hours available for most roles
                - Salary sacrifice, company enhanced pension scheme
                - Life insurance at 4x your salary
                - Hybrid/remote working
                - Private Medical Insurance with VitalityHealth including mental health support and cancer care. Partner benefits include discounts with Waitrose, Mr&Mrs Smith and Peloton
                - Generous family-friendly policies
                - Varied social groups set up and run by our employees
                - Perkbox membership giving access to retail discounts, a wellness platform for physical and mental health, and weekly free and boosted perks
                - Access to initiatives like Cycle to Work, Salary Sacrificed Gym partnerships and Electric Vehicle (EV) leasing
            """.trimIndent(),
                    employmentType = "Permanent",
                    workEnvironment = "Hybrid",
                    visaSponsorship = "Not available",
                    postedDate = "1 month ago",
                    requirements = """
                What we are looking for

                As a fully digital bank, we are looking for engineers that are able to understand and prioritise security when implementing new features, fixing bugs or making technical improvements, across all the layers. Our team is designing, building and releasing new screens every day, for this reason we are interested in people with a particular focus on Accessibility along with writing clean and maintainable code.

                The way to thrive and shine within Starling is to be a self-driven individual and be able to take full ownership of everything around you: From building the code, shipping and maintaining it, to sharing knowledge with your colleagues and making sure all processes are efficient and productive to deliver the best possible results for our customers.

                Our aim is to deliver stable, resilient and high quality code, that is why testing is another key quality we look for when expanding our team. We useEspressoto write our UI/E2E Test andJUnitto write our Unit Tests across all layers of the application, as well as manually test all features before they go into production. We also work closely with QA engineers to ensure we have an additional level of testing when working on complex feature delivery.

                All Starling engineers work in a hybrid pattern both from home and one of our offices. Our preference is that you’re located within a commutable distance to either our London, Manchester, Southampton or Cardiff office, so that we’re able to see each other and collaborate in person too.
            """.trimIndent(),
                    link = ""
                ),
                Jobs(
                    id = "0f5abc9c-8c1e-4653-aa2b-972e5b716812",
                    title = "Android Software Engineer",
                    role = "Mobile Developer",
                    companyLogo = R.drawable.ocado,
                    company = "Ocado Technology",
                    companyMotto = "We're putting the world's retailers online\nusing the cloud, robotics, AI, and IoT",
                    aboutUs = """
                After two decades, Ocado Group is entering an exciting new chapter in its history, while staying true to the ambitions, ideals and values that have led us to such success so far.

                As true pioneers of the online grocery market, we’ve blazed a trail through an increasingly digital world, both leading and benefiting from the fast-increasing consumer shift to online shopping. At the heart of it all lies our technological know-how and unparalleled IP.

                Our combined expertise and capabilities underpin the continued evolution of the Ocado Retail Limited platform, which has seen it become the biggest grocery retailer of its kind in the world. We're now taking those same unique qualities to help our partners around the world reach similar heights, through our Ocado Solutions business.
            """.trimIndent(),
                    city = "Hatfield",
                    country = "UK",
                    address = "",
                    industry = "E-Commerce · Robotics · Data",
                    description = """
                Due to growth, we have an exciting new opportunity for an Android Software Engineer to join our Ecommerce department on a permanent basis, based in Hatfield. (Hybrid Working)

                The 5 Stars team is responsible for inspiring shoppers on the web& mobile platforms, through features like  reviews, recommendations and product information.  We’re responsible for letting experienced shoppers shop quickly whilst providing inspiration and information to those who are uncertain. The team is made up of talented Android, iOS, Web and back-end engineers, Team Lead  and works closely with members of the UX, Product, and Data teams.

                We want the successful individual to bring their passion for building polished, effective solutions to the problems we set out to tackle. Our Android shopping app is native Kotlin with an MVVM architecture, backed by a Java microservice backend.
            """.trimIndent(),
                    experienceLevel = "Mid",
                    skills = listOf(
                        "Android",
                        "Kotlin",
                        "MVVM"
                    ),
                    salary = "Undisclosed",
                    companyBenefits = """
                Our employee benefits are designed for you, we care about people and we’ve ensured we have a wealth of benefits that focus on your well-being. We regularly review our benefits to ensure we are supporting our employees appropriately. Currently, we offer technically stretching work, a competitive salary and;

                - Hybrid working patterns meaning part of the working week can be spent working remotely (typically 3 days per week). However, your working pattern will depend upon your role/team.
                - 30 days working from anywhere policy
                - Wellbeing support through Apps such as Unmind and an Employee Assistance Programme
                - 25 days annual leave, rising to 27 days after 5 years service (plus optional holiday purchase)
                - Pension scheme (various options available including employer contribution matching up to 7%)
                - Private Medical Insurance
                - 22 weeks paid maternity leave and 6 weeks paid paternity leave (once relevant service requirements complete)
                - Train Ticket loan (interest-free)
                - Cycle to Work Scheme
                - Free shuttle bus to and from Hatfield Train Station to the Hatfield offices
                - Free shuttle bus to and from Welwyn Garden City Train Station to the Welwyn Garden City offices
                - Opportunity to participate in Sharesave and Buy as You Earn share schemes
                - 15% discount on Ocado.com and free delivery for all employees
                - Income Protection (can be up to 50% of salary for 3 years)
                - Life Assurance (3 x annual salary)
                
                We also have regular divisional socials, sports clubs not to mention the Ocado Technology Academy for a packed schedule of courses, conferences and events. If you think you have what it takes to make a difference, please submit your application below.
            """.trimIndent(),
                    employmentType = "Permanent",
                    workEnvironment = "Hybrid",
                    visaSponsorship = "Available",
                    postedDate = "1 Month ago",
                    requirements = """
                - You have great programming and technical design skills.
                - You have an extensive knowledge of the Android environment from developing high-quality apps.
                - Building production apps with Kotlin.
                - Taking pride in writing polished and fully-tested code.
                - Passionate about great UX.
                - You create user experiences with accessibility as a core requirement.
                - Your collaboration skills allow you to work effectively alongside a cross-functional team.
                - A desire to share knowledge and learn from others in order to improve your breadth and depth of knowledge
            """.trimIndent(),
                    link = ""
                )
            )
        ),
        navigateToJobDetailScreen = {}
    )
}

private typealias navigateToJobDetailScreen = (String) -> Unit

@Composable
fun JobsScreen(
    modifier: Modifier = Modifier,
    state: JobsState,
    navigateToJobDetailScreen: navigateToJobDetailScreen
) {

    // FF7966

    Box {

        Column(
            modifier = modifier
                .fillMaxSize()
                .background(
                    Color(0xFF1C1C23)
                )
        ) {

            Text(
                text = "Jobs",
                color = Color.White,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                modifier = modifier
                    .padding(
                        top = 40.dp,
                        start = 16.dp
                    )
            )

            LazyColumn(
                modifier = modifier.padding(top = 24.dp),
                contentPadding = PaddingValues(24.dp),
                verticalArrangement = Arrangement.spacedBy(24.dp)
            ) {

                items(
                    items = state.allJobs,
                    key = { it.id }
                ) { item ->

                    Card(
                        modifier = modifier
                            .fillMaxWidth()
                            .wrapContentHeight()
                            .border(
                                width = 2.dp,
                                color = Color(0xFFCFCFFC).copy(0.15f),
                                shape = RoundedCornerShape(16.dp)
                            )
                            .clickable {
                                navigateToJobDetailScreen(item.id)
                            },
                        shape = RoundedCornerShape(16.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.Transparent
                        )
                    ) {
                        Row(
                            modifier = modifier
                                .padding(16.dp)
                                .fillMaxSize()
                        ) {
                            Box(
                                modifier = modifier
                                    .fillMaxWidth()
                                    .wrapContentHeight()
//                                    .border(width = 1.dp, color = Color.White)
                            ) {
                                Column {
                                    Row {
                                        Image(
                                            painter = painterResource(id = item.companyLogo),
                                            contentDescription = "${item.company} icon",
                                            modifier = modifier
                                                .size(50.dp)
                                                .clip(CircleShape)
                                        )
                                        Column(
                                            modifier = modifier
                                                .padding(start = 12.dp),
                                            verticalArrangement = Arrangement.spacedBy(4.dp)
                                        ) {
                                            Text(
                                                text = item.company,
                                                color = Color.White,
                                                fontSize = 12.sp
                                            )
                                            Text(
                                                text = item.title,
                                                color = Color.White,
                                                fontSize = 14.sp,
                                                fontWeight = FontWeight.Bold
                                            )
                                            Row(
                                                modifier = modifier.padding(top = 2.dp),
                                                horizontalArrangement = Arrangement.spacedBy(8.dp)
                                            ) {
                                                Row(
                                                    verticalAlignment = Alignment.CenterVertically,
                                                    horizontalArrangement = Arrangement.spacedBy(2.dp)
                                                ) {
                                                    Icon(
                                                        imageVector = Icons.Outlined.LocationOn,
                                                        contentDescription = "location",
                                                        tint = Color.White
                                                    )
                                                    Text(
                                                        text = "${item.city}, ${item.country}",
                                                        color = Color.White,
                                                        fontSize = 12.sp
                                                    )
                                                }
                                                Text(
                                                    text = "-",
                                                    color = Color.White
                                                )
                                                Row(
                                                    verticalAlignment = Alignment.CenterVertically,
                                                    horizontalArrangement = Arrangement.spacedBy(2.dp)
                                                ) {
                                                    Icon(
                                                        imageVector = Icons.Outlined.Workspaces,
                                                        contentDescription = "work environment",
                                                        tint = Color.White
                                                    )
                                                    Text(
                                                        text = item.workEnvironment,
                                                        color = Color.White,
                                                        fontSize = 12.sp
                                                    )
                                                }
                                            }
                                            Text(
                                                text = item.experienceLevel,
                                                color = Color.White,
                                                fontSize = 12.sp
                                            )
                                        }
                                    }
                                    LazyRow(
                                        modifier = modifier.padding(top = 12.dp)
                                    ) {
                                        items(
                                            items = item.skills
                                        ) { skill ->
                                            SuggestionChip(
                                                onClick = {},
                                                label = {
                                                    Text(
                                                        text = skill,
                                                        color = Color.White,
                                                        fontSize = 12.sp
                                                    )
                                                },
                                                modifier = modifier.padding(end = 12.dp)
                                            )
                                        }
                                    }
                                    Box(
                                        modifier = modifier
                                            .fillMaxWidth()
//                                            .border(width = 1.dp, color = Color.White)
                                    ) {

                                        Text(
                                            text = "Posted: " + item.postedDate,
                                            color = Color.White,
                                            fontSize = 12.sp,
                                            modifier = modifier.align(Alignment.CenterStart)
                                        )

                                        Row(
                                            modifier = modifier
//                                                .border(width = 1.dp, color = Color.White)
                                                .align(Alignment.CenterEnd),
                                            verticalAlignment = Alignment.CenterVertically
                                        ) {
                                            IconButton(
                                                onClick = {

                                                }
                                            ) {
                                                Icon(
                                                    imageVector = Icons.Filled.Share,
                                                    contentDescription = "share job",
                                                    tint = Color.White
                                                )
                                            }
                                            Button(
                                                onClick = {
                                                   openUrl(url = item.link)
                                                },
                                                modifier = modifier
                                                    .width(120.dp)
                                                    .height(30.dp),
                                                shape = RectangleShape
                                            ) {
                                                Text(
                                                    text = "APPLY"
                                                )
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }

                }

            }

        }

        if (state.isLoading) {
            Box(
                modifier = modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                CircularProgressIndicator()
            }
        }

    }


}