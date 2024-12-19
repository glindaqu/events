let scroll = true;

document.querySelector("#menu-btn").addEventListener("click", event => {
    event.preventDefault();
    document.querySelector("#menu-btn").classList.toggle("open-menu-btn-click");
    document.querySelector("#menu-body").classList.toggle("header-menu-show");
    document.querySelector("body").classList.toggle("body-nonscroll");

    if (scroll) {
        window.onscroll = () => window.scroll(0, 0);
        window.scrollTo(0, 0);
    } else 
        window.onscroll = () => {};
    scroll = !scroll;
});
