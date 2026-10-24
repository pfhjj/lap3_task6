package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.weight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

data class Student(
    val name: String,
    val program: String,
    val gpa: String,
    val email: String,
    val city: String
)

@Composable
fun StudentCard(
    student: Student,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxWidth()
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box {
                    Box(
                        modifier = Modifier
                            .size(52.dp)
                            .clip(CircleShape)
                            .background(MaterialTheme.colorScheme.primary),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "FA",
                            color = MaterialTheme.colorScheme.onPrimary,
                            style = MaterialTheme.typography.bodyMedium
                        )
                    }

                    Box(
                        modifier = Modifier
                            .align(Alignment.BottomEnd)
                            .size(16.dp)
                            .clip(CircleShape)
                            .background(MaterialTheme.colorScheme.tertiary)
                            .border(
                                width = 2.dp,
                                color = MaterialTheme.colorScheme.surface,
                                shape = CircleShape
                            )
                    )
                }

                Spacer(modifier = Modifier.width(12.dp))

                Column(
                    modifier = Modifier.weight(1f)
                ) {
                    Text(
                        text = student.name,
                        color = MaterialTheme.colorScheme.onSurface,
                        style = MaterialTheme.typography.titleLarge
                    )

                    Text(
                        text = student.program,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        style = MaterialTheme.typography.bodyMedium
                    )
                }

                Text(
                    text = student.gpa,
                    color = MaterialTheme.colorScheme.primary,
                    style = MaterialTheme.typography.titleLarge
                )
            }

            HorizontalDivider()

            Text(
                text = student.email,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                style = MaterialTheme.typography.bodyMedium
            )

            Text(
                text = student.city,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun StudentCardPreview() {
    StudentCard(
        student = Student(
            name = "Fajr Abuzoah",
            program = "Computer Science",
            gpa = "4.50",
            email = "fajr@example.com",
            city = "Jubail, Eastern Province"
        ),
        modifier = Modifier.padding(16.dp)
    )
}