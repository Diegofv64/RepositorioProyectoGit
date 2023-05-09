let time = 0;
let timerDisplay = document.getElementById('timerDisplay');

function updateTime() {
  time++;
  timerDisplay.textContent = time;
}

setInterval(updateTime, 1000);