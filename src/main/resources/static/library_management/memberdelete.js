// 회원 삭제
const memberDelete = async () => {
    const mno = new URLSearchParams(location.search).get('mno');

    const get = await axios.delete(`/member?mno=${mno}`);
    if(get.data == 1){
        alert('회원 삭제 성공');
        location.href = '/library_management/member.html';
    }
}