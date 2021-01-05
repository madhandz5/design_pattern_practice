

<ul>
<h1><li style="list-style-type: upper-roman">Strategy Pattern</li></h1>
<ul>
<li>여러 알고리즘을 하나의 <strong style="color: red">추상적인 접근점</strong>을 만들어 접근 점에서 서로 <strong style="color: red">교환 가능</strong>하도록 만드는 패턴</li>
</ul>
<ul>
<li style="list-style-type: square">게임에서 캐릭터와 무기를 구현</li>
<ul>
<li style="list-style-type: decimal">무기는 칼, 활, 도끼 세가지 종류</li>
</ul>
</ul>
<h1><li style="list-style-type: upper-roman">Adapter Pattern</li></h1>
<ul>
<li>연관성 없는 두 객체를 <strong style="color: red">묶어서</strong>사용할 수 있도록 만든 패</li>
</ul>
<ul>
<li style="list-style-type: square">두 수에 대한 다음 연산을 수행하는 객체를 구현</li>
<ul>
<li style="list-style-type: decimal">수의 두 배(X2)의 수를 반환 (twiceOf(Float):Float)</li>
<li style="list-style-type: decimal">수의 반(1/2)의 수를 반환 (halfOf(Float):Float)</li>
</ul>
<li style="list-style-type: square">구현 객체 이름은 'Adapter'로 할것</li>
<li style="list-style-type: square">Math클래스에서 두 배와 절반을 구하는 함수는 <strong style="color: red">이미 구현</strong> 되어있음.</li>
</ul>
<h1><li style="list-style-type: upper-roman">Template Method Pattern</li></h1>
<ul>
<li>알고리즘의 구조를 <strong style="color: red">메소드에 정의하고</strong>하위 클래스에서 알고리즘 구조의 변경없이 알고리즘을 <strong style="color: red">재정의</strong>하는 패턴</li>
</ul>
<ul>
<li style="list-style-type: square">게임의 접속을 구현</li>
</ul>
<ul>
<li style="list-style-type: decimal">requestConnection(String str):String</li>
<ul>
<li style="list-style-type: square">다음을 고려할 것</li>
</ul>
<ul>
<li style="list-style-type: decimal">보안과정 : 보안 관련 부분을 처리 doSecurity(String string):String</li>
<li style="list-style-type: decimal">인증과정 : ID / PASSWORD가 일치하는지 확인 authentication(String id, String password):boolean</li>
<li style="list-style-type: decimal">권한과정 : 접속자가 게임매니저인지, 유료회원인지, 무료회원인지, 권한없는지 확인  authorization(String userName):int</li>
<li style="list-style-type: decimal">접속과정 : 접속자에게 커넥션 정보를 넘겨줌 connection(String info):String</li>
</ul>
</ul>
<h1><li style="list-style-type: upper-roman">Factory Method Pattern</li></h1>
<ul>
<li style="list-style-type: square">게임 아이템과 아이템 생성을 구현</li>
<ul>
<li style="list-style-type: decimal">아이템을 생성하기 전에 데이터 베이스에서 아이템 정보를 요청합니다.</li>
<li style="list-style-type: decimal">아이템을 생성 후 아이템 복제등의 불법을 방지하기 위해 데이터 베이스에 아이템 생성정보를 남깁니다.</li>
</ul>
</ul>
<ul>
<li style="list-style-type: square">아이템을 생성하는 주체를 ItemCreator로 이름 짓습니다.</li>
</ul>
<ul>
<li style="list-style-type: square">아이템은 item이라는 interface로 다룰 수 있도록 합니다.</li>
<ul>
<li style="list-style-type: decimal">item은 use함수를 기본 함수로 갖고 있습니다.</li>
</ul>
</ul>
<ul>
<li style="list-style-type: square">현재 아이템의 종류는 체력 회복 물약, 마력 회복 물약이 있습니다.</li>
</ul>
</ul>
