
default:
	rm build/js/packages/myproject-app/kotlin/myproject-app.js  || echo "no such file"
	./gradlew build
	ag 'var ProcessEnv = NodeJS.ProcessEnv' build
