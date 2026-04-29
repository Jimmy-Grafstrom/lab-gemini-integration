document.addEventListener('DOMContentLoaded', () => {
    const form = document.querySelector('form');
    const btn = form.querySelector('button[type="submit"]');
    const loadingMessage = document.getElementById('loadingMessage');

    form.addEventListener('submit', () => {
        // Inaktivera knappen för att förhindra flera tryck
        btn.disabled = true;
        btn.style.opacity = '0.5';
        btn.innerText = 'Thinking...';

        // Visa det animerade meddelandet
        loadingMessage.classList.remove('hidden');
    });

    // Toggle History Logic
    const toggleBtn = document.getElementById('toggleHistoryBtn');
    const historyList = document.getElementById('historyList');

    if (toggleBtn) {
        toggleBtn.addEventListener('click', () => {
            historyList.classList.toggle('expanded');
            
            if (historyList.classList.contains('expanded')) {
                toggleBtn.innerText = 'Show less';
            } else {
                toggleBtn.innerText = 'Show all history';
            }
        });
    }
});
