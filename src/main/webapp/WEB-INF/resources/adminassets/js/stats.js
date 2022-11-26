function generateColor(){
	let r = parseInt(Math.random()*255);
	let g = parseInt(Math.random()*255);
	let b = parseInt(Math.random()*255);
	return `rgb(${r},${g},${b})`;
}
function cateChart(id,cateLabels=[],cateInfo=[]){
	let colors = []
	for (let i =0;i < cateInfo.length;i++){
		colors.push(generateColor());
	}
	const data = {
  labels: cateLabels,
  datasets: [{
    label: 'Sản phẩm',
    data: cateInfo,
    backgroundColor: colors,
    hoverOffset: 4
  }]
};
const config = {
  type: 'doughnut',
  data: data,
};
let ctx = document.getElementById(id).getContext("2d")
new Chart(ctx, config)
}

function productChart(id,productLabels=[],productInfo=[]){
	let colors = []
	for (let i =0;i < productInfo.length;i++){
		colors.push(generateColor());
	}
	const data = {
  labels: productLabels,
  datasets: [{
    label: 'Thống kê doanh thu theo sản phẩm',
    data: productInfo,
    fill: false,
    borderColor: colors,
    backgroundColor: colors,
    tension: 0.1
  }]
};
const config = {
  type: 'bar',
  data: data,
};
let ctx = document.getElementById(id).getContext("2d")
new Chart(ctx, config)
}
function monthChart(id,monthLabels=[],monthInfo=[]){
	let colors = []
	for (let i =0;i < monthInfo.length;i++){
		colors.push(generateColor());
	}
	const data = {
  labels: monthLabels,
  datasets: [{
    label: 'Thống kê doanh thu theo tháng',
    data: monthInfo,
    fill: false,
    borderColor: colors,
    backgroundColor: colors,
    tension: 0.1
  }]
};
const config = {
  type: 'bar',
  data: data,
};
let ctx = document.getElementById(id).getContext("2d")
new Chart(ctx, config)
}