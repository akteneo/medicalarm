class MainActivity : AppCompatActivity() {
    private var shiftTime = 0 // Время сдвига в минутах

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val shiftText = findViewById<TextView>(R.id.shiftTimeText)
        val btnMinus = findViewById<Button>(R.id.btnMinus)
        val btnPlus = findViewById<Button>(R.id.btnPlus)
        val btnApplyShift = findViewById<Button>(R.id.btnApplyShift)

        // Уменьшаем сдвиг
        btnMinus.setOnClickListener {
            if (shiftTime > 0) {
                shiftTime -= 5
                shiftText.text = "Сдвиг: $shiftTime мин"
            }
        }

        // Увеличиваем сдвиг
        btnPlus.setOnClickListener {
            shiftTime += 5
            shiftText.text = "Сдвиг: $shiftTime мин"
        }

        // Применяем сдвиг ко всем будильникам
        btnApplyShift.setOnClickListener {
            shiftAllAlarms(shiftTime)
        }
    }

    private fun shiftAllAlarms(shift: Int) {
        // Здесь будет логика сдвига всех будильников на shift минут
        Toast.makeText(this, "Будильники сдвинуты на $shift минут", Toast.LENGTH_SHORT).show()
    }
}
