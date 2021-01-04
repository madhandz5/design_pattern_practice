

<ul>
<li style="list-style-type: upper-roman">Strategy Pattern</li>
<li style="list-style-type: upper-roman">Adapter Pattern</li>
<li style="list-style-type: upper-roman">Template Method Pattern</li>
<li style="list-style-type: upper-roman">Factory Method Pattern</li> 
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
