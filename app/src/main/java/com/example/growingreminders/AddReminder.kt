package com.example.growingreminders

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.material.TextButton
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun AddReminder(){
    TextButton(
        onClick = {}
    ){
        Text("Add Reminder")
    }
}

@Preview(showBackground = true)
@Composable
fun AddReminderPreview(){
    AddReminder()
}