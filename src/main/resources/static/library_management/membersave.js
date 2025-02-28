// 회원 등록
const memberSave = () => {
    const mid = document.querySelector('.mid').value;
    const mpwd = document.querySelector('.mpwd').value;
    const mname = document.querySelector('.mname').value;

    const obj = { mid, mpwd, mname }
    axios.post('/member', obj)
        .then(r => {
            alert('회원 등록 성공');
            location.href = '/library_management/member.html';
        })
        .catch(e => {console.log(e);})
}