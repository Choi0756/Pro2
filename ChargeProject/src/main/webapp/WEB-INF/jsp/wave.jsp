.wave {
    background-image: url("data:image/svg+xml;base64,PHN2ZyB2aWV3Qm94PSIwIDAgMTc0LjQ3MDY0IDQ2LjM0NTk0IiB2ZXJzaW9uPSIxLjEiIHhtbG5zPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwL3N2ZyI+CiAgPGRlZnM+CiAgICA8bGluZWFyR3JhZGllbnQgaWQ9IndhdmUtZ3JhZGllbnQiIHgxPSIwJSIgeTE9IjEwMCUiIHgyPSIwJSIgeTI9IjAlIj4KICAgICAgPHN0b3Agc3R5bGU9InN0b3AtY29sb3I6IzAwMDAzZjsiIG9mZnNldD0iMCIgaWQ9ImRlZXAtb2NlYW4iIC8+CiAgICAgIDxzdG9wIHN0eWxlPSJzdG9wLWNvbG9yOiM0ZTZmZmY7IiBvZmZzZXQ9IjEiIGlkPSJzaGFsbG93LW9jZWFuIiAvPgogICAgPC9saW5lYXJHcmFkaWVudD4KICA8L2RlZnM+CiAgPHBhdGggc3R5bGU9ImZpbGw6dXJsKCN3YXZlLWdyYWRpZW50KTtmaWxsLXJ1bGU6ZXZlbm9kZCIgZD0ibSAwLDExLjM4NDQ4IGMgMCwwIDIxLjEzMzg1MSwxMS4zOTUzMSA0My42MTc2NjEsMTEuMzg0NDEgQyA2Ni4xMDE0NzEsMjIuNzU3OTkgMTA3Ljk2ODU2LDAuMDMyNjIgMTMwLjUwOCw3ZS01IGMgMjIuNTM5NDQsLTAuMDMyNSA0My45NjI2NCwxMS4zODQ0MSA0My45NjI2NCwxMS4zODQ0MSBWIDQ2LjM0NTk0IEggMCBaIiAvPgo8L3N2Zz4=");
    background-repeat: repeat-x;
    background-size: 500px auto;
    background-position: bottom;
    position: absolute;
    left: 0;
    width: 100%;
    height: 200px;
    animation: wave 5s cubic-bezier(0.36, 0.45, 0.63, 0.53) infinite;
    z-index: 1;
}

.wave:nth-of-type(2) {
    opacity: 0.7;
    animation: swell 5s ease -1.25s infinite, wave 5s cubic-bezier(0.36, 0.45, 0.63, 0.53) -.125s infinite;
    z-index: 0;
}

@keyframes wave {
    0% {
        background-position-x: 0%;
    }
    100% {
        background-position-x: -500px;
    }
}

@keyframes swell {
    0%, 100% {
        background-position: right bottom 10px;
    }
    50% {
        background-position: right bottom 0;
    }