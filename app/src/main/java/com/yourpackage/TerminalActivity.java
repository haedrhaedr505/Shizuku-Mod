package com.yourpackage; // استبدل بـ package مشروعك

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.termux.view.TerminalView;

public class TerminalActivity extends AppCompatActivity {
    private TerminalView terminalView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terminal);
        
        terminalView = findViewById(R.id.terminal_view);
        // يمكنك إضافة إعدادات إضافية هنا
    }
}
