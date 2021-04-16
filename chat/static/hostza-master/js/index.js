var socket = io()

/* 접속 되었을 때 실행 */
socket.on('connect', function() {
  var name = prompt('이름을 입력해 주세요', '')

  if(!name) {
    name = '익명'
  }

  socket.emit('newUser', name)
  
  document.getElementById('name').value = name;
})

/* 서버로부터 데이터 받은 경우 */
socket.on('update', function(data) {
  var chat = document.getElementById('chat')
  
  var outer = document.createElement('div')
  var message = document.createElement('div')
  var node = document.createTextNode(`${data.name}: ${data.message}`)
  var className = ''

  switch(data.type) {
    case 'message':
      className = 'other'
      break

    case 'connect':
      className = 'connect'
      break

    case 'disconnect':
      className = 'disconnect'
      break
  }

  message.classList.add(className)
  message.appendChild(node)
  outer.classList.add("outer")
  chat.appendChild(outer).appendChild(message)
})

/* 메시지 전송 함수 */
function send() {
  var message = document.getElementById('test').value
  
  document.getElementById('test').value = ''

  // 내가 전송할 메시지 클라이언트에게 표시
  var chat = document.getElementById('chat')
  var msg = document.createElement('div')
  var node = document.createTextNode(message)
  var outer = document.createElement('div')
  msg.classList.add('me')
  msg.appendChild(node)
  outer.classList.add("outer2")
  chat.appendChild(outer).appendChild(msg)

  // 서버로 message 이벤트 전달 + 데이터와 함께
  socket.emit('message', {type: 'message', message: message})
}
