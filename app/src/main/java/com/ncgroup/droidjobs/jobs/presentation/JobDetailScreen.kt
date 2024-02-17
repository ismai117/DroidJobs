package com.ncgroup.droidjobs.jobs.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
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
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.ncgroup.droidjobs.R
import com.ncgroup.droidjobs.jobs.data.service.bulletPoint
import com.ncgroup.droidjobs.jobs.domain.model.Jobs
import com.ncgroup.droidjobs.utils.openUrl
import java.util.UUID


@Preview(showBackground = true)
@Composable
fun JobDetailScreenPreview() {
    JobDetailScreen(
        navController = rememberNavController(),
        state = JobsState(
            job = Jobs(
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
                33 days holiday (including flexible bank holidays)
                An extra day’s holiday for your birthday
                16 hours paid volunteering time a year
                Part-time and/or flexible hours available for most roles
                Salary sacrifice, company enhanced pension scheme
                Life insurance at 4x your salary
                Hybrid/remote working
                Private Medical Insurance with VitalityHealth including mental health support and cancer care. Partner benefits include discounts with Waitrose, Mr&Mrs Smith and Peloton
                Generous family-friendly policies
                Varied social groups set up and run by our employees
                Perkbox membership giving access to retail discounts, a wellness platform for physical and mental health, and weekly free and boosted perks
                Access to initiatives like Cycle to Work, Salary Sacrificed Gym partnerships and Electric Vehicle (EV) leasing
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
            )
        ),
        getJob = {}
    )
}

private typealias getJob = () -> Unit

@OptIn(ExperimentalMaterial3Api::class, ExperimentalLayoutApi::class)
@Composable
fun JobDetailScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
    state: JobsState,
    getJob: getJob
) {

    val scrollState = rememberScrollState()

    LaunchedEffect(Unit) {
        getJob()
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {},
                navigationIcon = {
                    IconButton(
                        onClick = {
                            navController.popBackStack()
                        }
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.KeyboardArrowLeft,
                            contentDescription = "navigate back"
                        )
                    }
                },
                actions = {
                    IconButton(
                        onClick = {

                        }
                    ) {
                        Icon(
                            imageVector = Icons.Filled.Share,
                            contentDescription = "share job"
                        )
                    }
                },
                colors = TopAppBarColors(
                    containerColor = Color(0xFF1C1C23),
                    scrolledContainerColor = Color.Transparent,
                    navigationIconContentColor = Color.White,
                    titleContentColor = Color.Transparent,
                    actionIconContentColor = Color.White
                )
            )
        }
    ) { paddingValues ->
        Box(
            modifier = modifier.padding(paddingValues)
        ) {

            Column(
                modifier = modifier
                    .fillMaxSize()
                    .verticalScroll(scrollState)
                    .background(
                        Color(0xFF1C1C23)
                    ),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                state.job?.companyLogo?.let {
                    Image(
                        painter = painterResource(id = it),
                        contentDescription = "${state.job.company} icon",
                        modifier = modifier
                            .padding(top = 40.dp)
                            .size(90.dp)
                            .clip(CircleShape)
                    )
                }

                Column(
                    modifier = modifier
                        .padding(top = 24.dp)
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(6.dp)
                ) {

                    Text(
                        text = state.job?.company.orEmpty(),
                        color = Color.White,
                        fontSize = 12.sp
                    )

                    Text(
                        text = state.job?.title.orEmpty(),
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        fontSize = 14.sp
                    )

                    Row(
                        modifier = modifier.padding(top = 12.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(4.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Outlined.LocationOn,
                            contentDescription = "location",
                            tint = Color.White
                        )
                        Text(
                            text = "${state.job?.address}",
                            color = Color.White,
                            fontSize = 12.sp
                        )
                    }

                    Text(
                        text = state.job?.industry.orEmpty(),
                        color = Color.White,
                        modifier = modifier.padding(top = 20.dp),
                        fontSize = 12.sp
                    )

                    Text(
                        text = state.job?.companyMotto.orEmpty(),
                        color = Color.White,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = modifier
                            .padding(top = 20.dp, start = 24.dp, end = 24.dp)
                    )

                }

                Column(
                    modifier = modifier
                        .padding(top = 40.dp, start = 24.dp, end = 24.dp)
                        .fillMaxWidth(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Overview",
                        color = Color.White,
                        fontSize = 24.sp
                    )
                    HorizontalDivider(
                        modifier = modifier
                            .padding(top = 12.dp)
                            .width(120.dp)
                            .background(Color.White),
                        thickness = 3.dp,
                    )
                }

                Column(
                    modifier = modifier
                        .padding(top = 40.dp, start = 24.dp, end = 24.dp)
                        .fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {

                    Text(
                        text = "Skills & Experience",
                        color = Color.White,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Column(
                        modifier = modifier.padding(top = 12.dp),
                        verticalArrangement = Arrangement.spacedBy(6.dp)
                    ) {
                        Text(
                            text = "Job roles:",
                            color = Color.White,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium
                        )
                        Text(
                            text = "Mobile Developer",
                            color = Color.White,
                            fontSize = 14.sp
                        )
                    }

                    Column(
                        modifier = modifier.padding(top = 8.dp),
                        verticalArrangement = Arrangement.spacedBy(6.dp)
                    ) {
                        Text(
                            text = "Tech stack/tooling used:",
                            color = Color.White,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium
                        )
                        FlowRow {
                            state.job?.skills.orEmpty().forEach {
                                Text(
                                    text = it,
                                    color = Color.White,
                                    fontSize = 14.sp,
                                    modifier = modifier.padding(end = 8.dp)
                                )
                            }
                        }
                    }

                    Column(
                        modifier = modifier.padding(top = 8.dp),
                        verticalArrangement = Arrangement.spacedBy(6.dp)
                    ) {
                        Text(
                            text = "Core skills we consider:",
                            color = Color.White,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium
                        )
                        FlowRow {
                            state.job?.skills.orEmpty().forEach {
                                Text(
                                    text = it,
                                    color = Color.White,
                                    fontSize = 14.sp,
                                    modifier = modifier.padding(end = 8.dp)
                                )
                            }
                        }
                    }

                }

                Column(
                    modifier = modifier
                        .padding(top = 40.dp, start = 24.dp, end = 24.dp)
                        .fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {

                    Text(
                        text = "Logistics",
                        color = Color.White,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Column(
                        modifier = modifier.padding(top = 12.dp),
                        verticalArrangement = Arrangement.spacedBy(6.dp)
                    ) {
                        Text(
                            text = "Base Salary:",
                            color = Color.White,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium
                        )
                        Text(
                            text = state.job?.salary.orEmpty(),
                            color = Color.White,
                            fontSize = 14.sp
                        )
                    }

                    Column(
                        modifier = modifier.padding(top = 8.dp),
                        verticalArrangement = Arrangement.spacedBy(6.dp)
                    ) {
                        Text(
                            text = "Employment type:",
                            color = Color.White,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium
                        )
                        Text(
                            text = state.job?.employmentType.orEmpty(),
                            color = Color.White,
                            fontSize = 14.sp
                        )
                    }

                    Column(
                        modifier = modifier.padding(top = 8.dp),
                        verticalArrangement = Arrangement.spacedBy(6.dp)
                    ) {
                        Text(
                            text = "Remote working:",
                            color = Color.White,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium
                        )
                        Text(
                            text = state.job?.workEnvironment.orEmpty(),
                            color = Color.White,
                            fontSize = 14.sp
                        )
                    }

                    Column(
                        modifier = modifier.padding(top = 8.dp),
                        verticalArrangement = Arrangement.spacedBy(6.dp)
                    ) {
                        Text(
                            text = "Visa sponsorship:",
                            color = Color.White,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium
                        )
                        Text(
                            text = state.job?.visaSponsorship.orEmpty(),
                            color = Color.White,
                            fontSize = 14.sp
                        )
                    }

                }

                Column(
                    modifier = modifier
                        .padding(top = 40.dp, start = 24.dp, end = 24.dp)
                        .fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {

                    Text(
                        text = "Job Description",
                        color = Color.White,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Column(
                        modifier = modifier.padding(top = 12.dp),
                        verticalArrangement = Arrangement.spacedBy(6.dp)
                    ) {
                        Text(
                            text = state.job?.description.orEmpty(),
                            color = Color.White,
                            fontSize = 14.sp
                        )
                    }

                }

                Column(
                    modifier = modifier
                        .padding(top = 40.dp, start = 24.dp, end = 24.dp)
                        .fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {

                    Text(
                        text = "Requirements",
                        color = Color.White,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Column(
                        modifier = modifier.padding(top = 12.dp),
                        verticalArrangement = Arrangement.spacedBy(6.dp)
                    ) {
                        state.job?.requirements.orEmpty().lines()
                            .forEachIndexed { _, requirement ->
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                                ) {
                                    if (!requirement.endsWith(":") && requirement.isNotBlank()){
                                        Text(
                                            text = bulletPoint,
                                            color = Color.White
                                        )
                                    }
                                    Text(
                                        text = requirement,
                                        color = Color.White,
                                        fontSize = 14.sp
                                    )
                                }
                            }
                    }

                }

                Column(
                    modifier = modifier
                        .padding(top = 40.dp, start = 24.dp, end = 24.dp)
                        .fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {

                    Text(
                        text = "About Us",
                        color = Color.White,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Column(
                        modifier = modifier.padding(top = 12.dp),
                        verticalArrangement = Arrangement.spacedBy(6.dp)
                    ) {
                        Text(
                            text = state.job?.aboutUs.orEmpty(),
                            color = Color.White,
                            fontSize = 14.sp
                        )
                    }

                }

                Column(
                    modifier = modifier
                        .padding(top = 40.dp, start = 24.dp, end = 24.dp)
                        .fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {

                    Text(
                        text = "Company Benefits",
                        color = Color.White,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Column(
                        modifier = modifier.padding(top = 12.dp),
                        verticalArrangement = Arrangement.spacedBy(4.dp)
                    ) {
                        state.job?.companyBenefits.orEmpty().lines()
                            .forEachIndexed { _, benefit ->
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                                ) {
                                    if (!benefit.endsWith(":") && benefit.isNotBlank()){
                                        Text(
                                            text = bulletPoint,
                                            color = Color.White
                                        )
                                    }
                                    Text(
                                        text = benefit,
                                        color = Color.White,
                                        fontSize = 14.sp
                                    )
                                }
                            }
                    }

                }

                Box(
                    modifier = modifier
                        .padding(top = 40.dp, bottom = 40.dp)
                        .fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {

                    Button(
                        onClick = {
                            openUrl(url = state.job?.link)
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

            if (state.isLoading) {
                Box(
                    modifier = modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    CircularProgressIndicator(color = Color.White)
                }
            }

        }
    }

}