// 회원 상세 조회
const memberView = async () => {
    const mno = new URLSearchParams(location.search).get('mno');
    try{
        const get = await axios.get(`/member/view?mno=${mno}`)
        const mid = document.querySelector('.mid').value = get.data.mid;
        const mname = document.querySelector('.mname').value = get.data.mname;
    }catch(e){console.log(e);}
}
memberView();



// 회원 수정
const memberUpdate = async () => {
    const mno = new URLSearchParams(location.search).get('mno');

    const mpwd = document.querySelector('.mpwd').value;
    const mname = document.querySelector('.mname').value;

    obj = {mno, mpwd, mname}

    const get = await axios.put('/member', obj)
    if(get.data == 1){
        alert('회원 수정 성공');
        location.href = '/library_management/member.html';
    }
}