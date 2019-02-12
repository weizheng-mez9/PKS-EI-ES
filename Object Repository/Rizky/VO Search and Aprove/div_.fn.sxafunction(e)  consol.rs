<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_.fn.sxafunction(e)  consol</name>
   <tag></tag>
   <elementGuidId>cac06403-c6ff-4897-8257-916096f75a48</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>id</name>
      <type>Main</type>
      <value>memberContent</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
					



































$.fn.sxa=function(e) {
// 	console.log('in sxa');
	var sourceObj = $(this);
	var confirmBeforeSubmit =sourceObj.attr('confirmBeforeSubmit');
	var isAllowGuestSubmit = sourceObj.attr('isAllowGuestSubmit');
	var confirmBeforeSubmitDivId = null;
		
	var header = $(&quot;meta[name='_csrf_header']&quot;).attr(&quot;content&quot;);
	var token = $(&quot;meta[name='_csrf']&quot;).attr(&quot;content&quot;);
	
	confirmBeforeSubmitDivId = sourceObj.attr('confirmBeforeSubmitDivId');
	//add new ajax request to check for session timeout before allow normal ajax submission
	if(isAllowGuestSubmit){
		submission(confirmBeforeSubmit,confirmBeforeSubmitDivId,sourceObj);
	}else{
		var validateSessionUrl = &quot;/eisportal&quot;+&quot;/checkSessionTimeout&quot;;

       $.ajax({
	           type: &quot;POST&quot;,
	           url: validateSessionUrl,
	           beforeSend: function(xhr){
	        	   if(header){
	               	xhr.setRequestHeader(header, token);
	        	   }
	           },
	           success: function(response){

	        	   if((response.indexOf('j_spring_security_check')> 0 || response == &quot;sessionTimeout&quot;) &amp;&amp; (typeof(sourceObj.attr('formId')) != 'undefined' &amp;&amp; sourceObj.attr('formId') != 'businessRegistrationForm')){
		        	 window.location.replace(&quot;/eisportal&quot;+&quot;/&quot;);
		        	 alert(&quot;Sorry, your session timed out after a long time of inactivity. No data will be saved. Please, click OK and sign in again.&quot;);
		           }else{
		        	   submission(confirmBeforeSubmit,confirmBeforeSubmitDivId,sourceObj);
		           }
	           },
		   		error:function(xhr, status, error){
					console.log(xhr.responseText);
					
					if(xhr.responseText === undefined){
						console.log('undefined response text.');
						console.log('xhr: '+xhr);
						console.log('status: '+status);
						console.log('error: '+error);
					}else{
						if(xhr.responseText.indexOf('Your support ID is') > -1){
							errorPopUp(xhr.responseText);
						}else{
							console.log('got responseText but not whitelist error: '+xhr.responseText);
						}
					}
				}
	           });
 	
		}
	e.preventDefault();       
};

function submission(confirmBeforeSubmit,confirmBeforeSubmitDivId,sourceObj){
	console.info('in submission');
	   //continue with normal ajax function;
			if(confirmBeforeSubmit){
				var dialogContent;
				if(confirmBeforeSubmitDivId != null){
					
					$(&quot;#&quot;+confirmBeforeSubmitDivId).dialog({
						open: function(event, ui) {
							$(&quot;.ui-dialog-titlebar&quot;).hide();
						}, 
						//dialogClass: 'dialogCustomize',
						draggable: false,
						resizable: false,
						modal: true,
						width: '500px',
						buttons: [{
					 		class:'redBtn',
					 		text:'Batal',
					 		click: function() {
					 			$(this).dialog(&quot;close&quot;);
						 	}
					 	},
					 	{
                            class:'blueBtn',
							text:'Ya',
							click:function() {
								$(this).dialog(&quot;close&quot;);
								ajaxValidation(sourceObj);
							}
					 	}
						          
						]
					});
				}else{
					
					dialogContent = $('&lt;div class=&quot;confirmation-invest&quot;>&lt;/div>')
					dialogContent.prepend('&lt;h1>PENGESAHAN&lt;/h1>');
					dialogContent.append('&lt;p>' +  sourceObj.attr('confirmationMessage') + '&lt;/p>');
					dialogContent.prepend('&lt;div class=&quot;clear pb10&quot;>&lt;/div>');
					
					dialogContent.dialog({
						dialogClass: 'dialogCustomize', 
						modal: true,
						width: '500px',
						buttons: [{
					 		class:'redBtn',
					 		text:'Batal',
					 		click: function() {
					 			$(this).dialog(&quot;close&quot;);
						 	}
					 	},
					 	{
                            class:'blueBtn',
							text:'Ya',
							click:function() {
								$(this).dialog(&quot;close&quot;);
								ajaxValidation(sourceObj);
							}
					 	}
						          
						]
					});
				}
				
			}else{
				ajaxValidation(sourceObj);
			}
}

function ajaxValidation(sourceObj) {
// 	 console.log('in ajaxvalidation');
		var target = sourceObj.attr('target');
		var url = '';
		var formId = sourceObj.attr('formId');
		var targetErrFormId = sourceObj.attr('targetErrFormId');
		var validate = false;
		var dataStr = '';
		var type = 'GET';
		var enctype='';
		
		var header = $(&quot;meta[name='_csrf_header']&quot;).attr(&quot;content&quot;);
		var token = $(&quot;meta[name='_csrf']&quot;).attr(&quot;content&quot;);
		
// 		console.log((url=='')+'test:'+$('#'+formId).attr('action'));

		$('#'+target).find(&quot;div.successNote&quot;).hide();
		
		if(sourceObj=='undefined') {
			alert('Error:Form cant be null!');
		}
		
		
		if(sourceObj.attr('validate') != 'undefined') {
			validate=sourceObj.attr('validate');
		}
		
 		if(typeof(formId) != 'undefined' &amp;&amp; formId != ''){
			dataStr = new FormData($('#'+formId)[0]);
			if($('#'+formId).attr('action') != 'undefined' &amp;&amp; $('#'+formId).attr('action') != '') {
				url=$('#'+formId).attr('action');
			}
			if(typeof( $('#'+formId).attr('method')) != 'undefined'){
				type = $('#'+formId).attr('method');
			}
		}
 		
		
		if(typeof(sourceObj.attr('href')) != 'undefined' &amp;&amp; sourceObj.attr('href')!='#') {
			url=sourceObj.attr('href');
		}
 		
		if($('#'+formId).find('input[type=file]').length > 0) {
			enctype=$('#'+formId).attr('enctype');
			console.log(enctype);
		}
			
		
		//console.log('dataStr:'+dataStr);
		//console.log('type:'+type);
	 		if(validate) {
// 	 			console.log('blockUI(ajaxValidation)');
// 	 			blockUI({ message: '&lt;h1>&lt;img src=&quot;/eisportal/resources/img/busy.gif&quot; /> Validating Form...&lt;/h1>' });
	 			blockUI('ajaxValidation');
				var validateUrl = url.indexOf('?') != -1 ? url.substring(0,url.indexOf('?'))+&quot;Validate&quot;+url.substring(url.indexOf('?')) : url+&quot;Validate&quot;;
				//console.log(&quot;validateUrl:&quot;+validateUrl);
				$.ajax({
					url: validateUrl,
					dataType: 'json',
					type: type,
					enctype: enctype,
					data: dataStr,		
					cache: false,
				    processData: false, // Prevent the file from beeing converted to string
				    contentType: false, // Set the content file to false prevent JQuery from using 'application/x-www-form-urlencoded; charset=UTF-8' as default type
				    beforeSend: function(xhr){
			        	   if(header){
				               	xhr.setRequestHeader(header, token);
				        	   }
				    },
				    success: function(json){
						if(json != null){
							if(json.jsonFieldError.length > 0) {
								if(typeof targetErrFormId !== typeof undefined &amp;&amp; targetErrFormId !== false){
									formId = targetErrFormId;
								}

								/* $('#'+formId).find(&quot;label.errorClass&quot;).removeClass('errorClass'); */
								$('#'+formId).find(&quot;div&quot;).removeClass('form-animate-error');
								$('#'+formId).find('input[type=&quot;text&quot;]').removeClass(&quot;border-red&quot;);
								$('em').remove();
								$('#'+formId).find('i.inner-icon-error').remove();
								$.each(json.jsonFieldError, function(i){
									var element = $('#'+formId).find('label[for*=&quot;'+json.jsonFieldError[i].fieldName+'&quot;]');

									
									element.parent(&quot;div&quot;).addClass(&quot;form-animate-error&quot;);
									var inputElement = $('#'+formId).find('input[type=&quot;text&quot;][name*=&quot;'+json.jsonFieldError[i].fieldName+'&quot;]');
									var elemI = $('&lt;i>&lt;/i>').addClass(&quot;fa fa-close redIcon icon inner-icon-error&quot;);
									inputElement.addClass(&quot;border-red&quot;);
// 									(elemI).insertBefore(inputElement); // Tony : change to (elemI).insertBefore(em)
									element.parent(&quot;div&quot;).addClass(&quot;border-red&quot;);
									var em=$('&lt;em/>').addClass('requirementstar').text(json.jsonFieldError[i].errorMsg);
									em.appendTo(element.parent(&quot;div&quot;));
									(elemI).insertBefore(em);
								});
								$('#'+formId).find(&quot;span.errorClass&quot;).remove();
								/* $('html, body').animate({scrollTop:.closest(&quot;div&quot;).offset().top}); */
								$('#'+formId).find('label[for*=&quot;'+json.jsonFieldError[0].fieldName+'&quot;]').focus();
// 								console.log('unblockUI(ajaxValidation)');
								unblockUI('success validate');
							} else if(json.jsonGlobalError.length > 0) {
								$.each(json.jsonGlobalError, function(i){

		 							/* var span=$('&lt;span/>').addClass('errorClass').text(json.jsonGlobalError[i].errorMsg);
									$('#'+formId).prepend(span); */
									
									alert(json.jsonGlobalError[i].errorMsg);
									
								});
// 								console.log('unblockUI(ajaxValidation)');
								unblockUI('success validate');
							} else {
// 								console.log('unblockUI(ajaxValidation) - no error found');
								unblockUI('no more validate msg');
								ajaxSubmission(url, type, dataStr,target, sourceObj);
							}		
						}
					},
					complete: function(){	
						//Tony : comment to fix to avoid unblockUI before ajaxSubmission
// 						console.log('unblockUI(ajaxValidation) complete ajaxvalidation');
// 						unblockUI('complete ajaxvalidation');
					},
					error:function(xhr, status, error){
						console.log(xhr.responseText);
						
						if(xhr.responseText === undefined){
							console.log('undefined response text.');
							console.log('xhr: '+xhr);
							console.log('status: '+status);
							console.log('error: '+error);
						}else{
							if(xhr.responseText.indexOf('Your support ID is') > -1){
								errorPopUp(xhr.responseText);
							}else{
								console.log('got responseText but not whitelist error: '+xhr.responseText);
							}
						}
						
						unblockUI('error calling ajax');
						//somthing error if got this alert hide it if don't want to show
// 						alert(xhr.message + ' ' + status + ',' + error);
					}
				});
			
			}else {
				console.log('validte= false, continue to ajaxSubmission');
				ajaxSubmission(url, type, dataStr,target, sourceObj);
			}
}

function ajaxSubmission(url, type, dataStr,target, sourceObj) {
// 	console.log('proceed:'+url);

	var header = $(&quot;meta[name='_csrf_header']&quot;).attr(&quot;content&quot;);
	var token = $(&quot;meta[name='_csrf']&quot;).attr(&quot;content&quot;);
	var formId = sourceObj.attr('formId');
	var submissionBtn_divId = sourceObj.attr('submissionBtnDivId');

// 	console.log('in ajaxSubmission');
// 	console.log('blockUI(ajaxSubmission)');
	if(typeof(submissionBtn_divId) !== 'undefined' &amp;&amp; submissionBtn_divId != ''){
	    console.log(submissionBtn_divId+' attr Disabled true');
        $('#'+submissionBtn_divId+' :input').prop('disabled', true);
    }
	blockUI('ajaxSubmission');
	$.ajax({
		url: url,
		dataType: 'html',
		type: type,
		data: dataStr,		
		cache: false,
		processData: false, // Prevent the file from beeing converted to string
	    contentType: false, // Set the content file to false prevent JQuery from using 'application/x-www-form-urlencoded; charset=UTF-8' as default type
	    beforeSend: function(xhr){
     	   if(header){
              	xhr.setRequestHeader(header, token);
       	   }
	    },
	    success: function(htmlResult){
	    	//console.log('target : '+target);
				//console.log('htmlResult : '+htmlResult);
				if(isJson(htmlResult)) {
					var response = JSON.parse(htmlResult);
					if(response.responseStatus != &quot;success&quot;) {
						var span=$('&lt;span/>').addClass('errorClass').text(response.errorMsg);
						$('#'+formId).prepend(span);
					} else {
						if(typeof(sourceObj.attr('successMsg')) != 'undefined' &amp;&amp; sourceObj.attr('successMsg') != '') {
							alert(sourceObj.attr('successMsg'));
						}
						//alert(response.errorMsg);
						//if(response.redirectUrl != null &amp;&amp; response.redirectUrl != ''){
						window.location.replace(&quot;/eisportal&quot;+ response.redirectUrl);
						//} else {
						//	window.location.href = &quot;/eisportal&quot;+ response.hrefUrl;
						//}
					}
				} else {
					if(typeof(target) != 'undefined' &amp;&amp; target != ''){
						if(typeof(sourceObj.attr('successMsg')) != 'undefined' &amp;&amp; sourceObj.attr('successMsg') != '') {
							alert(sourceObj.attr('successMsg'));
						}
						$('#'+target).html('');
						$('#'+target).html(htmlResult);
					}
				}
		},
		complete: function(){
// 			console.log('unblockUI(ajaxValidation) complete ajaxSubmission');
			unblockUI('complete ajaxsubmission');
		},
		error:function(xhr, status, error){
			console.log(xhr.responseText);

            if(typeof(submissionBtn_divId) !== 'undefined' &amp;&amp; submissionBtn_divId != ''){
                console.log(submissionBtn_divId+' removeAttr disabled');
                $('#'+submissionBtn_divId+' :input').removeAttribute('disabled');
            }

			if(xhr.responseText === undefined){
				console.log('undefined response text.');
				console.log('xhr: '+xhr);
				console.log('status: '+status);
				console.log('error: '+error);
			}else{
				if(xhr.responseText.indexOf('Your support ID is') > -1){
					errorPopUp(xhr.responseText);
				}else{
					console.log('got responseText but not whitelist error: '+xhr.responseText);
				}
			}
		}
	});
}

function blockUI(msg) {
	$.blockUI({ message: '&lt;i class=&quot;fa fa-spinner fa-pulse fa-3x fa-fw&quot;>&lt;/i>&lt;span class=&quot;sr-only&quot;>Loading...&lt;/span>',
		css: {
	        border:     'none',
	        backgroundColor:'transparent'
	    }
	});
	//console.log(msg+' blockui');
}

function successBlockUI(msg) {
  	$.blockUI({ message: '&lt;h2>&lt;b>Success. Click to continue. &lt;/b>&lt;/h2>',
  		showOverlay: true,
  		onOverlayClick: $.unblockUI
  	});
}

function errorBlockUI(msg) {
  	$.blockUI({ message: '&lt;h2>&lt;b>Failed to generate. Click to continue &lt;/b>&lt;/h2>',
  		showOverlay: true,
  		onOverlayClick: $.unblockUI
  	});
}

function unblockUI(msg) {
	$.unblockUI();
	//console.log(msg+' unblockui');
}

function isJson(str) {
    try {
        JSON.parse(str);
    } catch (e) {
        return false;
    }
    return true;
}
function isDecimalNumberKeyPress(el, evt) {
	var charCode = (evt.which) ? evt.which : evt.keyCode;
    var number = el.value.split('.');
    if (charCode != 46 &amp;&amp; charCode > 31 &amp;&amp; (charCode &lt; 48 || charCode > 57)) {
        return false;
    }
    if (evt.ctrlKey) {
        if (evt.keyCode == 65 || evt.keyCode == 97) { // 'A' or 'a'
            //console.log(&quot;controll pressed&quot;);
            evt.preventDefault();
            return;
        }
    }
    //just one dot
    if(number.length>1 &amp;&amp; charCode == 46){
         return false;
    }
    //get the carat position
    var caratPos = getCaretPosition(el);
    var dotPos = el.value.indexOf(&quot;.&quot;);
    if( caratPos > dotPos &amp;&amp; dotPos>-1 &amp;&amp; (number[1].length > 1)){
        return false;
    }
    return true;
}
function isDecimalNumberKeyPressWithDecimalLimit(el, evt,decimal) {
	var charCode = (evt.which) ? evt.which : evt.keyCode;
    var number = el.value.split('.');
    if (charCode != 46 &amp;&amp; charCode > 31 &amp;&amp; (charCode &lt; 48 || charCode > 57)) {
        return false;
    }
    if (evt.ctrlKey) {
        if (evt.keyCode == 65 || evt.keyCode == 97) { // 'A' or 'a'
            //console.log(&quot;controll pressed&quot;);
            evt.preventDefault();
            return;
        }
    }
    //just one dot
    var enValue = el.value;
    
    if(number.length>1 &amp;&amp; charCode == 46){
         return false;
    }
    
    if(enValue.indexOf(&quot;.&quot;) != -1){
    	var splitfield = enValue.split(&quot;.&quot;);
    	if(splitfield[1].length >= decimal){
        	return false;
    	}
    }
    
    
    //get the carat position
    var caratPos = getCaretPosition(el);
    var dotPos = el.value.indexOf(&quot;.&quot;);
    if( caratPos > dotPos &amp;&amp; dotPos>-1 &amp;&amp; (number[1].length > 1)){
        return false;
    }
    
    return true;
}
function getCaretPosition (ctrl) {
	if (document.selection) {
	// IE &lt; 9 Support
		ctrl.focus();
		var range = document.selection.createRange();
		var rangelen = range.text.length;
		range.moveStart ('character', -ctrl.value.length);
		var start = range.text.length - rangelen;
		return {'start': start, 'end': start + rangelen };
	} else if (ctrl.selectionStart || ctrl.selectionStart == '0') {
	// IE >=9 and other browsers
		return {'start': ctrl.selectionStart, 'end': ctrl.selectionEnd };
	} else {
		return {'start': 0, 'end': 0};
	}
}

function roundNumber(number,decimal_points) {
	if(!decimal_points) return Math.round(number);
	
	
	if(number == 0) {
		var decimals = &quot;&quot;;
		for(var i=0;i&lt;decimal_points;i++) decimals += &quot;0&quot;;
		return &quot;0.&quot;+decimals;
	}

	
	var exponent = Math.pow(10,decimal_points);
	var num = Math.round((number * exponent)).toString();
	
	if(num.length &lt; 2){
		num = &quot;0&quot; + num;
	}
	
	return num.slice(0,-1*decimal_points) + &quot;.&quot; + num.slice(-1*decimal_points);
}

function isNumericKeyPress(event) {
	var key = window.event ? event.keyCode : event.which;
	if (event.keyCode == 8 || event.keyCode == 37 || event.keyCode == 39) {
	    return true;
	}
	else if ( key &lt; 48 || key > 57 ) {
	    return false;
	} if (event.keyCode == 46) {
		return false;
	}
	else return true;
}

function isNumericOnPaste(fieldInput, isDecimal){
	
	setTimeout(function(){
		var inputText = fieldInput.value;
		if(typeof(inputText)!= 'undefined'){
			if(isDecimal==true){
	    		var outputText = inputText.replace(/[^0-9.]+/g,&quot;&quot;);			
			}else{
				var outputText = inputText.replace(/[^0-9]+/g,&quot;&quot;);
			}
    		
    		if (inputText != outputText){
    			fieldInput.value= outputText
        		return fieldInput.value;               
        	}
		}
	}, 0);
}

function round(value, decimals) {
	if($.trim(value) != '') {
		var v = Number(Math.round(value+'e'+decimals)+'e-'+decimals).toFixed(decimals);
		return v.replace(/\B(?=(\d{3})+(?!\d))/g, &quot;,&quot;);
	} else {
		return &quot;&quot;;
	}
}

function isPhoneNumberOnKeydown(evt, element) {
	var oldvalue = element.value;
    var field = element;
    setTimeout(function () {
        if(field.value.indexOf('+60') !== 0) {
            $(field).val(oldvalue);
        } 
    }, 1);
}
function isPhoneNumber(evt, element) {
	evt = (evt) ? evt : window.event;
	var charCode = (evt.which) ? evt.which : evt.keyCode;
	if(element.selectionStart==0){
		if (charCode != 43 &amp;&amp; charCode > 31 &amp;&amp; (charCode &lt; 48 || charCode > 57)) { //charCode &lt; 48 allow 0
	       return false;
	   }
	} else {
	   if (charCode > 31 &amp;&amp; (charCode &lt; 48 || charCode > 57)) {
	       return false;
	   }
	}
	   return true;
}

function isPhoneNumberOnPaste(input) {

	setTimeout(function(){
		var inputText = input.value;
		var firstChar = inputText.charAt(0);
		var remainingValue = inputText.substring(1);
		if(typeof(inputText)!= 'undefined'){
			var text1 = firstChar.replace(/[^1-9+]+/g,&quot;&quot;);
			var text2 = remainingValue.replace(/[^0-9]+/g,&quot;&quot;);
		   	var outputText = text1 + text2;
		   	
		   	if (inputText != outputText){
		   		input.value= outputText
		       	return &quot;+&quot;+ input.value;          
		    }
		}
	}, 0);
}

/* function isNumber(evt){
	evt = (evt) ? evt : window.event;
	var charCode = (evt.which) ? evt.which : evt.keyCode;
	
	//charCode 8 == &quot;backspace&quot;, fix for firefox
	if ((event.charCode >= 48 &amp;&amp; event.charCode &lt;= 57) || event.charCode == 8) {
		return true;
	} else {
		return false;
	}
} */

function isAlphabetic(evt){
	evt = (evt) ? evt : window.event;
	var charCode = (evt.which) ? evt.which : evt.keyCode;
	
	if (charCode >= 48 &amp;&amp; charCode &lt;= 57) {
		evt.preventDefault();
    }
}

function isAlphabeticOnPaste(fieldInput, isAlphabetic){
    setTimeout(function(){
		var inputText = fieldInput.value;
		if(typeof(inputText)!= 'undefined'){
	    	var outputText = inputText.replace(/[0-9]/g, &quot;&quot;);	
    		
    		if (inputText != outputText){
    			fieldInput.value= outputText
        		return fieldInput.value;               
        	}
		}
	}, 0);
}

function goBack() {
    window.history.go(-1);
}

function countChars(textbox, counter, maxlength) {
	var count = document.getElementById(textbox).value.length;
	var result = maxlength - count;
	document.getElementById(counter).innerHTML = result;
}

function addBreadcrumb(url, currentPage) {
	var cookieStr = getCookie(&quot;breadcrumb&quot;);
	cookieStr = cookieStr.replace(&quot;&lt;strong>&quot;, &quot;&quot;);
	cookieStr = cookieStr.replace(&quot;&lt;/strong>&quot;, &quot;&quot;);
	if(currentPage != '') {
		var currentPageLink = &quot;&lt;a href=&quot; + url + &quot;>&lt;strong>&quot; + currentPage + &quot;&lt;/strong>&lt;/a>&quot;;
		var str = cookieStr + ' &lt;span>>&lt;/span> &lt;p>' + currentPageLink + '&lt;/p> ';
	} else {
		var str = cookieStr;
	}
	setCookie(&quot;breadcrumb&quot;, str, 1);
}

function startOverBreadcrumb(url, currentPage) {
	if(currentPage != '') {
		var currentPageLink = &quot;&lt;a href='&quot; + url + &quot;'>&lt;strong>&quot; + currentPage + &quot;&lt;/strong>&lt;/a>&quot;;
		var str = '&lt;p>&lt;a href=&quot;&quot;>Home&lt;/a>&lt;/p>' + ' &lt;span>>&lt;/span> &lt;p>' + currentPageLink + '&lt;/p> ';
	} else {
		var str = '&lt;p>&lt;a href=&quot;&quot;>Home&lt;/a>&lt;/p>';
	}
	setCookie(&quot;breadcrumb&quot;, str, 1);
}

function loadBreadcrumb() {
	var str = getCookie(&quot;breadcrumb&quot;);
	$('.breadcrumb').html($(str));
}

function setCookie(cname,cvalue,exdays) {
    var d = new Date();
    d.setTime(d.getTime() + (exdays*24*60*60*1000));
    var expires = &quot;expires=&quot; + d.toGMTString();
    document.cookie = cname + &quot;=&quot; + cvalue + &quot;;&quot; + expires + &quot;;path=/&quot;;
}

function getCookie(cname) {
    var name = cname + &quot;=&quot;;
    var decodedCookie = decodeURIComponent(document.cookie);
    var ca = decodedCookie.split(';');
    for(var i = 0; i &lt; ca.length; i++) {
        var c = ca[i];
        while (c.charAt(0) == ' ') {
            c = c.substring(1);
        }
        if (c.indexOf(name) == 0) {
            return c.substring(name.length, c.length);
        }
    }
    return &quot;&quot;;
}

/* =========================================================================== */
/* Datatable listing related */
/* =========================================================================== */
function updateDataTableSelectAllCtrl(table){
    var $table             = table.table().node();
    var $chkbox_all        = $('tbody input[type=&quot;checkbox&quot;]', $table);
    var $chkbox_checked    = $('tbody input[type=&quot;checkbox&quot;]:checked', $table);
    var chkbox_select_all  = $('thead .dt-checkboxes-select-all', $table).get(0);

    //console.log(data['amount']);

    // If none of the checkboxes are checked
    if($chkbox_checked.length === 0){
        chkbox_select_all.checked = false;
        if('indeterminate' in chkbox_select_all){
            chkbox_select_all.indeterminate = false;
        }

        // If all of the checkboxes are checked
    } else if ($chkbox_checked.length === $chkbox_all.length){
        chkbox_select_all.checked = true;
        if('indeterminate' in chkbox_select_all){
            chkbox_select_all.indeterminate = false;
        }

        // If some of the checkboxes are checked
    } else {
        chkbox_select_all.checked = true;
        if('indeterminate' in chkbox_select_all){
            chkbox_select_all.indeterminate = true;
        }
    }
}
/* =========================================================================== */
/* =========================================================================== */

function showDivIfSelectedOthers(divId,val1,val2) {
    console.debug(divId+&quot; - &quot;+val1+&quot; - &quot;+val2)
    if(val1 === val2){
        $('#'+divId).show();
    }else{
        $('#'+divId).hide();
    }
}

function errorPopUp(responseText){
	console.log('in errorPopUp - ' + responseText);
// 	var str = '&lt;html>&lt;head>&lt;title>Request Rejected&lt;/title>&lt;/head>&lt;body>' +
// 	'This is a message from ASSIST Administrator.&lt;br>&lt;br>' +
// 	'The requested URL is rejected due to security administration. Please email PERKESO CSC with the screenshot. Thank You.&lt;br>&lt;br>'+
// 	'Kami Prihatin.&lt;br>&lt;br>' +
// 	'The requested URL was rejected. Please consult with your administrator.&lt;br>&lt;br>Your support ID is: 14763094522915602072&lt;br>&lt;br>&lt;a href=&quot;javascript:history.back();&quot;>[Go Back]&lt;/a>&lt;/body>&lt;/html>';
	var title = responseText.substring(
			responseText.lastIndexOf(&quot;&lt;title>&quot;) + 7, 
			responseText.lastIndexOf(&quot;&lt;/title>&quot;)
		);
	var htmlParse = $.parseHTML(responseText);
	$('#commonModalTitle').html(title);
	$('#commonModalMsg').html(htmlParse);
	$('#commonModal').modal('toggle');
}






	
		
			
				
					×
				
                
			
              
			
				
			
		
	





	






	
			
		
	
	
	
	
	
	
	
	
	

		
			
				MAKLUMAT AM
				
					
						
							
								KELAYAKAN CARUMAN*  
								
							
							
								NO JSA*
								
								
								
							
						
					
				
			

			
			MAKLUMAT ORANG BERINSURAN
			
				
					
						
							
								
									Nama Penuh *
										(seperti dalam MyKad) 
										
										
								
							

							
								
									 No. Kad Pengenalan* Baru
									
									
								

								
									No. Kad Pengenalan Lama / Kod Pseudo  / No Passport 
									 
									
									
								
							

							
								
									Tarikh Lahir* 
										
										
								
								
								
									Umur
									
									
								

								
									Status Perkahwinan  
									
										
										Tunggal
										Berkahwin
										Bercerai

									Tunggal
								
								
								
									Bangsa  *
									
										
                                           Bumiputera Sabah
                                        
                                           Bumiputera Sarawak
                                        
                                           Cina
                                        
                                           India
                                        
                                           Melayu
                                        
                                           Orang Asli (Semenanjung)
                                        
									Bumiputera Sabah
								
							

							
								
									Agama 
										
											
	                                           Islam
	                                        
	                                           Kristian
	                                        
	                                           Buddha
	                                        
	                                           Hindu
	                                        
	                                           Sikhism
	                                        
	                                           Tao
	                                        
	                                           Konfusianisma
	                                        
	                                           Bahai
	                                        
	                                           Tiada Agama/Aitismisme
	                                        
	                                           Lain-lain Agama
	                                        
	                                           Tiada Maklumat
	                                        
										Islam
									
								

								
									Jantina *
									

										Lelaki
										Perempuan

									Perempuan
								

								
									Kewarganegaraan *
									
										--Sila Pilih--
										
											Malaysia
										
											Penduduk Tetap
										
											Bukan Warganegara
										
									--Sila Pilih--
								
							

							
								
									Alamat *
									 
									
									
									
									
								
							

							
								
									Negeri *
									 
									
										
                                           JOHOR
                                        
                                           KEDAH
                                        
                                           KELANTAN
                                        
                                           MELAKA
                                        
                                           NEGERI SEMBILAN
                                        
                                           PAHANG
                                        
                                           PERAK
                                        
                                           PERLIS
                                        
                                           PULAU PINANG
                                        
                                           SABAH
                                        
                                           SARAWAK
                                        
                                           SELANGOR
                                        
                                           TERENGGANU
                                        
                                           WILAYAH PERSEKUTUAN KUALA LUMPUR
                                        
                                           WILAYAH PERSEKUTUAN LABUAN
                                        
                                           WILAYAH PERSEKUTUAN PUTRAJAYA
                                        
									JOHOR
								
								
								
									Bandar *
									 
									
									
								
								
								
									Poskod*
									 
									
									
								
							

							
								
									Pendidikan  
									
									
										
                                           O Levels
                                        
                                           A Levels
                                        
                                           DIPLOMA LANJUTAN
                                        
                                           Ijazah/Diploma Lanjutan
                                        
                                           IJAZAH SARJANA MUDA
                                        
                                           Ijazah Sarjana Muda
                                        
                                           SKM1
                                        
                                           SKM2
                                        
                                           SKM3
                                        
                                           5
                                        
                                           DIPLOMA
                                        
                                           IJAZAH KEDOKTORAN (MOD KERJA KURSUS &amp; PENYELIDIKAN)
                                        
                                           Diploma
                                        
                                           Doktor Falsafah
                                        
                                           GRADUAN SIJIL
                                        
                                           GRADUAN DIPLOMA
                                        
                                           Pendidikan Tinggi
                                        
                                           Sekolah Menengah
                                        
                                           6
                                        
                                           LAIN-LAIN
                                        
                                           7
                                        
                                           SARJANA (MOD KERJA KURSUS &amp; PENYELIDIKAN)
                                        
                                           SARJANA (PENYELIDIKAN)
                                        
                                           Kemahiran Diploma Malaysia (DLKM Tahap 5-8)
                                        
                                           Kemahiran Diploma Malaysia (DKM Tahap 4)
                                        
                                           Sarjana 
                                        
                                           Matrikulasi
                                        
                                           TIADA PENDIDIKAN FORMAL
                                        
                                           Tidak Berpelajaran
                                        
                                           Tidak Mempunyai Pendidikan
                                        
                                           8
                                        
                                           DOKTOR FALSAFAH (PENYELIDIKAN)
                                        
                                           2
                                        
                                           PMR / SRP / LCE
                                        
                                           PMR/PT3
                                        
                                           SIJIL PASCASISWAZAH
                                        
                                           DIPLOMA PASCASISWAZAH
                                        
                                           Diploma Lepasan Ijazah
                                        
                                           Pra - Universiti
                                        
                                           Pendidikan Rendah
                                        
                                           Sijil Profesional
                                        
                                           Sarjana Profesional
                                        
                                           SKM Level 1-3
                                        
                                           3
                                        
                                           SPM / SPM (V)
                                        
                                           SPM/O-LEVEL/GCE
                                        
                                           4
                                        
                                           STPM / STP / STAM / HSC
                                        
                                           STPM/STAM/A-LEVEL
                                        
                                           Pendidikan Menengah
                                        
                                           1
                                        
                                           UPSR
                                        
                                           UPSR/PSRA
                                        
                                           Universiti
                                        
									PMR/PT3
								
							

							
								
									No Telefon Rumah  
									
									
								

								
									No. Tel. Bimbit
									
									
								
							

							
								
									E-mel 
									
									
								

								
									Status Pekerjaan *

									
										
										 
										Berkerja 
										
									
									
									
										
										 
										Tidak Berkerja 
										
									
								

								
									
										Jawatan Terakhir* 
										
									

									
										Gaji Terakhir* 
										
									
									
									
										Ujian Psikometrik*
										
										
									
								
							
						
					
				
			

			
				BUTIR-BUTIR LATIHAN
				
					
						
							
							
								
									
										
										Institut* 
										
	                                        --Sila Pilih--
	                                        
	                                        	NIOSH HQ (BANGI)
	                                        
	                                        	NIOSH NORTHERN REGION (MANJUNG)
	                                        
	                                        	NIOSH NORTHERN REGION (SEBERANG JAYA)
	                                        
	                                        	NIOSH SOUTHERN REGION (AYER KEROH)
	                                        
	                                        	NIOSH SOUTHERN REGION (SENAI)
	                                        
	                                        	NIOSH SOUTHERN REGION (KOTA TINGGI)
	                                        
	                                        	NIOSH WILAYAH PANTAI TIMUR (KUANTAN)
	                                        
	                                        	NIOSH WILAYAH PANTAI TIMUR (KERTEH)
	                                        
	                                        	NIOSH SARAWAK REGION (BINTULU)
	                                        
	                                        	NIOSH SARAWAK REGION (KUCHING)
	                                        
	                                        	NIOSH SARAWAK REGION (MIRI)
	                                        
	                                        	NIOSH SARAWAK REGION (SERIAN)
	                                        
	                                        	NIOSH SABAH REGION (KOTA KINABALU)
	                                        
	                                        	NIOSH SABAH REGION (SANDAKAN)
	                                        
	                                        	NIOSH SABAH REGION (TAWAU)
	                                        
	                                        	NIOSH W.P LABUAN REGION (LABUAN)
	                                        
	                                        	NIOSH CERTIFICATION SDN BHD (BANGI)
	                                        
	                                        	ADTEC (TAIPING)
	                                        
	                                        	ILP (KEPALA BATAS)
	                                        
	                                        	ILP ARUMUGAM PILLAI (NIBONG TEBAL)
	                                        
	                                        	ILP (IPOH)
	                                        
	                                        	ILP (PEDAS)
	                                        
	                                        	ILP (SELANDAR)
	                                        
	                                        	ADTEC (BATU PAHAT)
	                                        
	                                        	 ILP (PASIR GUDANG)
	                                        
	                                        	ILP (TANGKAK)
	                                        
	                                        	ADTEC (KEMAMAN)
	                                        
	                                        	ADTEC (JERANTUT)
	                                        
	                                        	ILP (KUALA TERENGGANU)
	                                        
	                                        	ILP (KOTA BHARU)
	                                        
	                                        	ILP (MARANG)
	                                        
	                                        	ILP (MIRI)
	                                        
	                                        	ILP (LABUAN)
	                                        
	                                        	ILP (BUKIT KATIL)
	                                        
	                                        	JMTI (SIMPANG AMPAT)
	                                        
	                                        	CESS ILP (PERAI) 
	                                        
	                                        	CIAST (SHAH ALAM)
	                                        
	                                        	TRRC (BEMBAN)
	                                        
										NIOSH HQ (BANGI)
									
								
								
								
									
										
										Nama Kursus* 
										
											--Sila Pilih--
											
		                                         
COMPUTER SYSTEM MAINTENANCE                                                               

		                                   	
		                                         
COMPUTER SYSTEM REPAIR                               

		                                   	
		                                         
COMPUTER SYSTEM SET-UP

		                                   	
		                                         
FIBER INSTALLATION CERTIFYING AGENCY 
(EXTERNAL)
		                                   	
		                                         
FIBER INSTALLATION CERTIFYING AGENCY 
(INTERNAL)
		                                   	
		                                         
SERVER INSTALLATION                               

		                                   	
		                                         
SERVER MAINTENANCE                             

		                                   	
		                                          GTAW Process Carbon Steel Plate
		                                   	
		                                          GTAW and SMAW Combination
		                                   	
		                                          MILLING MACHINE OPERATION
		                                   	
		                                          Safety and Health Officer (Modular)*
		                                   	
		                                         3.0 VISUAL WELDING INSPECTOR
		                                   	
		                                         A GUIDE TO SCAFFOLD USE IN THE CONSTRUCTION INDUSTRY
		                                   	
		                                         Accident Investigation Reporting in Plantation
Industry
		                                   	
		                                         Accident Investigation Reporting in Plantation
Industry
		                                   	
		                                         Accident Investigation Reporting in Plantation
Industry
		                                   	
		                                         Accident Investigation Reporting in Plantation
Industry
		                                   	
		                                         Accident Investigation and Reporting
Workshop
		                                   	
		                                         Accident Investigation and Reporting
Workshop
		                                   	
		                                         Acrylic Fabrication
		                                   	
		                                         Air Kelantan Safety Card
		                                   	
		                                         Air Kelantan Safety Card
		                                   	
		                                         Asas Pendawaian Elektrik
		                                   	
		                                         Authorised Entrant &amp; Standby Person for Confined Space (AESP)
		                                   	
		                                         Authorised Entrant And Stanby Person For Confined Space For TM's Contractor
		                                   	
		                                         Authorised Entrant And Stanby Person For Confined Space For TM's Contractor
		                                   	
		                                         Authorised Entrant And Stanby Person For Confined Space For TM's Contractor
		                                   	
		                                         Authorised Entrant And Stanby Person For Confined Space For TM's Contractor
		                                   	
		                                         Authorised Entrant And Stanby Person For Confined Space For TM's Staff
		                                   	
		                                         Authorised Entrant And Stanby Person For Confined Space For TM's Staff
		                                   	
		                                         Authorised Entrant And Stanby Person For Confined Space For TM's Staff
		                                   	
		                                         Authorised Entrant And Stanby Person For Confined Space For TM's Staff
		                                   	
		                                         Authorised Entrant And Stanby Person For Confined Space Refresher For TM's Contractor
		                                   	
		                                         Authorised Entrant And Stanby Person For Confined Space Refresher For TM's Contractor
		                                   	
		                                         Authorised Entrant And Stanby Person For Confined Space Refresher For TM's Contractor
		                                   	
		                                         Authorised Entrant And Stanby Person For Confined Space Refresher For TM's Contractor
		                                   	
		                                         Authorised Entrant and Standby Person
For Confined Space - TM Contractor
		                                   	
		                                         Authorised Entrant and Standby Person
For Confined Space - TM Contractor
		                                   	
		                                         Authorised Entrant and Standby Person
For Confined Space - TM Staff
		                                   	
		                                         Authorised Entrant and Standby Person
For Confined Space - TM Staff
		                                   	
		                                         Authorised Entrant and Standby Person For
Confined Space
		                                   	
		                                         Authorised Entrant and Standby Person For
Confined Space
		                                   	
		                                         Authorised Entrant and Standby Person For
Confined Space
		                                   	
		                                         Authorised Entrant and Standby Person For
Confined Space
		                                   	
		                                         Authorised Entrant and Standby Person For
Confined Space
		                                   	
		                                         Authorised Entrant and Standby Person For
Confined Space
		                                   	
		                                         Authorised Entrant and Standby Person For
Confined Space
		                                   	
		                                         Authorised Entrant and Standby Person For
Confined Space
		                                   	
		                                         Authorised Entrant and Standby Person For
Confined Space
		                                   	
		                                         Authorised Entrant and Standby Person For
Confined Space
		                                   	
		                                         Authorised Entrant and Standby Person For
Confined Space - TM Contractor
		                                   	
		                                         Authorised Entrant and Standby Person For
Confined Space - TM Contractor
		                                   	
		                                         Authorised Entrant and Standby Person For
Confined Space - TM Contractor
		                                   	
		                                         Authorised Entrant and Standby Person For
Confined Space - TM Contractor
		                                   	
		                                         Authorised Entrant and Standby Person For
Confined Space - TM Staff
		                                   	
		                                         Authorised Entrant and Standby Person For
Confined Space - TM Staff
		                                   	
		                                         Authorised Entrant and Standby Person For
Confined Space - TM Staff
		                                   	
		                                         Authorised Entrant and Standby Person For
Confined Space - TM Staff
		                                   	
		                                         Authorised Entrant and Standby Person For
Confined Space Refresher
		                                   	
		                                         Authorised Entrant and Standby Person For
Confined Space Refresher
		                                   	
		                                         Authorised Entrant and Standby Person For
Confined Space Refresher
		                                   	
		                                         Authorised Entrant and Standby Person For
Confined Space Refresher
		                                   	
		                                         Authorised Entrant and Standby Person For
Confined Space Refresher
		                                   	
		                                         Authorised Entrant and Standby Person For
Confined Space Refresher
		                                   	
		                                         Authorised Entrant and Standby Person For Confined
Space
		                                   	
		                                         Authorised Entrant and Standby Person For Confined
Space
		                                   	
		                                         Authorised Entrant and Standby Person For Confined
Space
		                                   	
		                                         Authorised Entrant and Standby Person For Confined
Space - TM Contractor
		                                   	
		                                         Authorised Entrant and Standby Person For Confined
Space - TM Contractor
		                                   	
		                                         Authorised Entrant and Standby Person For Confined
Space - TM Contractor
		                                   	
		                                         Authorised Entrant and Standby Person For Confined
Space - TM Staff
		                                   	
		                                         Authorised Entrant and Standby Person For Confined
Space - TM Staff
		                                   	
		                                         Authorised Entrant and Standby Person For Confined
Space - TM Staff
		                                   	
		                                         Authorised Entrant and Standby Person For Confined
Space Refresher
		                                   	
		                                         Authorised Entrant and Standby Person For Confined
Space Refresher
		                                   	
		                                         Authorised Entrant and Standby Person For Confined
Space Refresher
		                                   	
		                                         Authorised Entrant and Standby Person For Confined Space
		                                   	
		                                         Authorised Entrant and Standby Person For Confined Space
		                                   	
		                                         Authorised Entrant and Standby Person For Confined Space
		                                   	
		                                         Authorised Entrant and Standby Person For Confined Space - TM Contractor
		                                   	
		                                         Authorised Entrant and Standby Person For Confined Space - TM Contractor
		                                   	
		                                         Authorised Entrant and Standby Person For Confined Space - TM Contractor
		                                   	
		                                         Authorised Entrant and Standby Person For Confined Space - TM Staff
		                                   	
		                                         Authorised Entrant and Standby Person For Confined Space Refresher
		                                   	
		                                         Authorised Entrant and Standby Person For Confined Space Refresher
		                                   	
		                                         Authorised Entrant and Standby Person For Confined Space Refresher
		                                   	
		                                         Authorised Entrant and Standby Person For Confined Space Refresher
		                                   	
		                                         Authorised Entrant and Standby Person For Confined Space Refresher
		                                   	
		                                         Authorised Entrant and Standby Person For Confined Space Refresher
		                                   	
		                                         Authorised Entrant and Standby Person For Confined Space Refresher
		                                   	
		                                         Authorised Entrant and Standby Person For Confined Space Refresher - TM Contractor
		                                   	
		                                         Authorised Entrant and Standby Person For Confined Space Refresher - TM Contractor
		                                   	
		                                         Authorised Gas Tester &amp; Entry Supervisor For Confined Space (AGTES)
		                                   	
		                                         Authorised Gas Tester and Entry Supervisor
For Confined Space
		                                   	
		                                         Authorised Gas Tester and Entry Supervisor
For Confined Space
		                                   	
		                                         Authorised Gas Tester and Entry Supervisor
For Confined Space -Refresher
		                                   	
		                                         Authorised Gas Tester and Entry Supervisor
For Confined Space -Refresher
		                                   	
		                                         Authorised Gas Tester and Entry Supervisor For
Confined Space
		                                   	
		                                         Authorised Gas Tester and Entry Supervisor For
Confined Space
		                                   	
		                                         Authorised Gas Tester and Entry Supervisor For
Confined Space
		                                   	
		                                         Authorised Gas Tester and Entry Supervisor For
Confined Space
		                                   	
		                                         Authorised Gas Tester and Entry Supervisor For
Confined Space
		                                   	
		                                         Authorised Gas Tester and Entry Supervisor For
Confined Space
		                                   	
		                                         Authorised Gas Tester and Entry Supervisor For
Confined Space
		                                   	
		                                         Authorised Gas Tester and Entry Supervisor For
Confined Space
		                                   	
		                                         Authorised Gas Tester and Entry Supervisor For
Confined Space
		                                   	
		                                         Authorised Gas Tester and Entry Supervisor For
Confined Space
		                                   	
		                                         Authorised Gas Tester and Entry Supervisor For
Confined Space
		                                   	
		                                         Authorised Gas Tester and Entry Supervisor For
Confined Space Refresher
		                                   	
		                                         Authorised Gas Tester and Entry Supervisor For
Confined Space Refresher
		                                   	
		                                         Authorised Gas Tester and Entry Supervisor For
Confined Space Refresher
		                                   	
		                                         Authorised Gas Tester and Entry Supervisor For
Confined Space Refresher
		                                   	
		                                         Authorised Gas Tester and Entry Supervisor For
Confined Space Refresher
		                                   	
		                                         Authorised Gas Tester and Entry Supervisor For
Confined Space Refresher
		                                   	
		                                         Authorised Gas Tester and Entry Supervisor For
Confined Space Refresher
		                                   	
		                                         Authorised Gas Tester and Entry Supervisor For
Confined Space Refresher
		                                   	
		                                         Authorised Gas Tester and Entry Supervisor For Confined Space
		                                   	
		                                         Authorised Gas Tester and Entry Supervisor For Confined Space
		                                   	
		                                         Authorised Gas Tester and Entry Supervisor For Confined Space
		                                   	
		                                         Authorised Gas Tester and Entry Supervisor For Confined Space (OGSP+AESP + AGTES)
		                                   	
		                                         Authorised Gas Tester and Entry Supervisor For Confined Space Refresher
		                                   	
		                                         Authorised Gas Tester and Entry Supervisor For Confined Space Refresher
		                                   	
		                                         Authorised Gas Tester and Entry Supervisor For Confined Space Refresher
		                                   	
		                                         Authorised Gas Tester and Entry Supervisor For Confined Space Refresher
		                                   	
		                                         Authorised Gas Tester and Entry Supervisor For Confined Space Refresher
		                                   	
		                                         Authorised Gas Tester and Entry Supervisor For Confined Space Refresher
		                                   	
		                                         Autocad
		                                   	
		                                         Automotive Worshop Safety &amp; Practise
		                                   	
		                                         BASIC KNOWLEDGE OF NON-DESTRUCTIVE TESTING : MAGNETIC PARTICLE TESTING
		                                   	
		                                         BASIC KNOWLEDGE OF NON-DESTRUCTIVE TESTING : PENETRANT TESTING
		                                   	
		                                         BASIC KNOWLEDGE OF SHIELDED METAL ARC WELDING (SMAW) : 1G AND 2G WELDING POSITION
		                                   	
		                                         BASIC KNOWLEDGE OF SHIELDED METAL ARC WELDING (SMAW) : 3G AND 4G WELDING POSITION
		                                   	
		                                         BBS:How to Implement a Culture of Safety and
Health in The Workplace
		                                   	
		                                         BBS:How to Implement a Culture of Safety and
Health in The Workplace
		                                   	
		                                         BBS:How to Implement a Culture of Safety and
Health in The Workplace
		                                   	
		                                         BBS:How to Implement a Culture of Safety and
Health in The Workplace
		                                   	
		                                         BRAKE SYSTEM RECTIFICATION WORK
		                                   	
		                                         Back Protection
		                                   	
		                                         Back Protection
		                                   	
		                                         Back Protection
		                                   	
		                                         Back Protection
		                                   	
		                                         Back Protection
		                                   	
		                                         Back Protection
		                                   	
		                                         Back Protection
		                                   	
		                                         Back Protection
		                                   	
		                                         Baju Blouse Hamil
		                                   	
		                                         Baju Blouse Longgar
		                                   	
		                                         Baju Blouse Separa Sendat
		                                   	
		                                         Baju Cheongsam
		                                   	
		                                         Baju Choali India
		                                   	
		                                         Baju Kebaya Tradisional
		                                   	
		                                         Baju Kemaja Lengan Pendek
		                                   	
		                                         Baju Kemeja Lengan Panjang
		                                   	
		                                         Baju Korporat
		                                   	
		                                         Baju Kurta
		                                   	
		                                         Baju Kurung Kedah
		                                   	
		                                         Baju Kurung Moden
		                                   	
		                                         Baju Kurung Tradisional
		                                   	
		                                         Baju Melayu Cekak Musang
		                                   	
		                                         Baju Melayu Moden
		                                   	
		                                         Basic 2D Drawing Using AutoCAD (Architecture)
		                                   	
		                                         Basic 2D Drawing Using AutoCAD (Engineering)
		                                   	
		                                         Basic 3D Drawing using SketchUp
		                                   	
		                                         Basic Adobe Illustrator
		                                   	
		                                         Basic Adobe Photoshop CS6
		                                   	
		                                         Basic Data Entry
		                                   	
		                                         Basic Domestic Electrical Wiring
		                                   	
		                                         Basic Electrical Wiring - Three Phase
		                                   	
		                                         Basic Electrical Wiring – Single Phase
		                                   	
		                                         Basic Occupational First Aid
		                                   	
		                                         Basic Occupational First Aid
		                                   	
		                                         Basic Occupational First Aid
		                                   	
		                                         Basic Occupational First Aid
		                                   	
		                                         Basic Occupational First Aid
		                                   	
		                                         Basic Occupational First Aid
		                                   	
		                                         Basic Occupational First Aid
		                                   	
		                                         Basic Occupational First Aid
		                                   	
		                                         Basic Occupational First Aid
		                                   	
		                                         Basic Occupational First Aid
		                                   	
		                                         Basic Occupational First Aid
		                                   	
		                                         Basic Occupational First Aid
		                                   	
		                                         Basic Occupational First Aid
		                                   	
		                                         Basic Occupational First Aid
		                                   	
		                                         Basic Occupational First Aid
		                                   	
		                                         Basic Occupational First Aid
		                                   	
		                                         Basic Offshore Occupational First Aid
		                                   	
		                                         Basic Offshore Occupational First Aid
		                                   	
		                                         Basic Offshore Occupational First Aid
		                                   	
		                                         Basic Offshore Occupational First Aid
		                                   	
		                                         Basic Piping Sistem
		                                   	
		                                         Basic Principal of Electrical Transformer
		                                   	
		                                         Basic Principle of Industrial Hygiene *New
		                                   	
		                                         Basic Principle of Industrial Hygiene *New
		                                   	
		                                         Basic Principle of Industrial Hygiene *New
		                                   	
		                                         Basic Principle of Industrial Hygiene *New
		                                   	
		                                         Basic Principle of Industrial Hygiene *New
		                                   	
		                                         Basic Principle of Industrial Hygiene *New
		                                   	
		                                         Basic Principle of Industrial Hygiene *New
		                                   	
		                                         Basic Principle of Industrial Hygiene *New
		                                   	
		                                         Basic Principle of Three Phase Motor
		                                   	
		                                         Basic Principles of DC Motor
		                                   	
		                                         Basic Rigging &amp; Slinging
		                                   	
		                                         Basic Rigging &amp; Slinging
		                                   	
		                                         Basic Rigging &amp; Slinging
		                                   	
		                                         Basic Rigging &amp; Slinging (Certificate by NIOSH)
		                                   	
		                                         Basic Scaffloding (Level 1) (Bandar Baru Bangi,Selangor) *New
		                                   	
		                                         Basic Scaffolding
		                                   	
		                                         Basic Scaffolding
		                                   	
		                                         Basic Scaffolding
		                                   	
		                                         Basic Scaffolding
		                                   	
		                                         Basic welding &amp; Mechanical Joinning for Plant Maintanance
		                                   	
		                                         Blown Film Production Process
		                                   	
		                                         Bread Making
		                                   	
		                                         CA1C FIBER OPTIC INTERNAL CABLING

		                                   	
		                                         CA2C FIBER OPTIC EXTERNAL CABLING
		                                   	
		                                         CCNA ROUTING AND SWITCHING; CCNA R&amp;S 1 : INTRODUCTION TO NETWORKS
		                                   	
		                                         CHILLER SYSTEM AND MAINTENANCE 
		                                   	
		                                         CISCO ITE
		                                   	
		                                         CMM METROLOGY (QC Technician)
		                                   	
		                                         CNC BASIC MACHINIST
		                                   	
		                                         CNC GRINDING PRACTICE
		                                   	
		                                         CNC LATHE MACHINE OPERATION
		                                   	
		                                         CNC Lathe Operation 
		                                   	
		                                         CNC MILLING MACHINE OPERATION
		                                   	
		                                         CNC MILLING PRACTICE
		                                   	
		                                         CNC Milling Operation
		                                   	
		                                         CNC TURNING PRACTICE
		                                   	
		                                         COMPUTER NETWORK CONNECTIVITY SET-UP                                                                
		                                   	
		                                         Cake Making
		                                   	
		                                         Chargeman L1
		                                   	
		                                         Chargeman L3
		                                   	
		                                         Chemical Health Risk Assessor *
		                                   	
		                                         Chemical Health Risk Assessor *
		                                   	
		                                         Chemical Health Risk Assessor *
		                                   	
		                                         Chemical Health Risk Assessor *
		                                   	
		                                         Chemical Health Risk Assessor *
		                                   	
		                                         Chemical Health Risk Assessor *
		                                   	
		                                         Chemical Health Risk Assessor *
		                                   	
		                                         Chemical Health Risk Assessor *
		                                   	
		                                         Chemical Health Risk Assessor*
		                                   	
		                                         Chemical Health Risk Assessor*
		                                   	
		                                         Chemical Health Risk Assessor*
		                                   	
		                                         Chemical Health Risk Assessor*
		                                   	
		                                         Classification, Labelling and Safety Data Sheet of Hazardous Chemicals (ADVANCED) *New
		                                   	
		                                         Compliance To Factories and Machienery Act 1967
and It's Regulations
		                                   	
		                                         Compliance To Factories and Machienery Act 1967
and It's Regulations
		                                   	
		                                         Compliance To Factories and Machienery Act 1967
and It's Regulations
		                                   	
		                                         Compliance To Factories and Machienery Act 1967
and It's Regulations
		                                   	
		                                         Compliance To Factories and Machinery Act
1967 and Its Regulations
		                                   	
		                                         Compliance To Factories and Machinery Act
1967 and Its Regulations
		                                   	
		                                         Compliance To Factories and Machinery Act
1967 and Its Regulations
		                                   	
		                                         Compliance To Factories and Machinery Act
1967 and Its Regulations
		                                   	
		                                         Compliance To Factories and Machinery Act 1967
and Its Regulations
		                                   	
		                                         Compliance To Factories and Machinery Act 1967
and Its Regulations
		                                   	
		                                         Compliance To Factories and Machinery Act 1967
and Its Regulations
		                                   	
		                                         Compliance To Factories and Machinery Act 1967 and Its Regulations
		                                   	
		                                         Compliance To Regulations Under Occupational
Safety and Health Act 1994
		                                   	
		                                         Compliance To Regulations Under Occupational
Safety and Health Act 1994
		                                   	
		                                         Compliance To Regulations Under Occupational
Safety and Health Act 1994
		                                   	
		                                         Compliance To Regulations Under Occupational
Safety and Health Act 1994
		                                   	
		                                         Compliance To Regulations Under Occupational
Safety and Health Act 1994
		                                   	
		                                         Compliance To Regulations Under Occupational
Safety and Health Act 1994
		                                   	
		                                         Compliance To Regulations Under Occupational
Safety and Health Act 1994
		                                   	
		                                         Compliance To Regulations Under Occupational
Safety and Health Act 1994
		                                   	
		                                         Compliance To Regulations Under Occupational
Safety and Health Act 1994
		                                   	
		                                         Compliance To Regulations Under Occupational
Safety and Health Act 1994
		                                   	
		                                         Compliance To Regulations Under Occupational
Safety and Health Act 1994
		                                   	
		                                         Compliance To Regulations Under Occupational Safety and Health Act 1994
		                                   	
		                                         Components, features and principles of advanced programming of CNC Milling and Lathe machine
		                                   	
		                                         Computer hardware set-up, server configuration, network cable installation, network maintenance &amp; network maintenance report
		                                   	
		                                         Computer set-up, installation, system maintenance, configuration &amp; maintenance report
		                                   	
		                                         Confined Space Rescue and First Response
		                                   	
		                                         Confined Space Rescue and First Response
		                                   	
		                                         Confined Space Rescue and First Response
		                                   	
		                                         Confined Space Rescue and First Response
		                                   	
		                                         Confined Space Rescue and First Response
		                                   	
		                                         Confined Space Rescue and First Response
		                                   	
		                                         Confined Space Rescue and First Response
		                                   	
		                                         Confined Space Rescue and First Response
		                                   	
		                                         Confined Space Safety (Trainer Programme)
		                                   	
		                                         Confined Space Safety (Trainer Programme)
		                                   	
		                                         Confined Space Safety (Trainer Programme)
		                                   	
		                                         Confined Space Safety (Trainer Programme)
		                                   	
		                                         Confined Space Safety (Trainer's Program)
		                                   	
		                                         Confined Space Safety (Trainer's Program)
		                                   	
		                                         Confined Space Safety (Trainer's Program)
		                                   	
		                                         Confined Space Safety (Trainer's Program)
		                                   	
		                                         Confined Space Safety (Trainer's Program)
		                                   	
		                                         Construction Safety &amp; Health Trainer
		                                   	
		                                         Construction Safety &amp; Health Trainer
		                                   	
		                                         Construction Safety &amp; Health Trainer
		                                   	
		                                         Construction Safety &amp; Health Trainer
		                                   	
		                                         Construction Safety &amp; Health Trainer
		                                   	
		                                         Construction Safety &amp; Health Trainer
		                                   	
		                                         Construction Safety &amp; Health Trainer
		                                   	
		                                         Construction Safety &amp; Health Trainer
		                                   	
		                                         Construction Safety &amp; Health Trainer
		                                   	
		                                         Construction Safety &amp; Health Trainer
		                                   	
		                                         Construction Safety &amp; Heatlh Trainer
		                                   	
		                                         Construction Safety &amp; Heatlh Trainer
		                                   	
		                                         Construction Safety &amp; Heatlh Trainer
		                                   	
		                                         Construction Safety &amp; Heatlh Trainer
		                                   	
		                                         Construction Safety Trainer
		                                   	
		                                         Construction Safety Trainer
		                                   	
		                                         Construction Safety Trainer
		                                   	
		                                         Contractor Safety Passport System
		                                   	
		                                         Contractor Safety Passport System
		                                   	
		                                         Contractor Safety Passport System
		                                   	
		                                         Contractor Safety Passport System
		                                   	
		                                         Contractor Safety Passport System
		                                   	
		                                         Contractor Safety Passport System
		                                   	
		                                         Contractor Safety Passport System
		                                   	
		                                         Contractor Safety Passport System
		                                   	
		                                         Contractor Safety Passport System - High Risk
Work
		                                   	
		                                         Contractor Safety Passport System - High Risk
Work
		                                   	
		                                         Contractor Safety Passport System - High Risk
Work
		                                   	
		                                         Contractor Safety Passport System - Low Risk
Work
		                                   	
		                                         Contractor Safety Passport System - Low Risk
Work
		                                   	
		                                         Contractor Safety Passport System - Low Risk
Work
		                                   	
		                                         Contractor Safety Passport System High-Risk
		                                   	
		                                         Contractor Safety Passport System Low-Risk
		                                   	
		                                         Customer Service
		                                   	
		                                         DEFENSIVE DRIVING : MANAGING OCCUPATIONAL ROAD SAFETY
		                                   	
		                                         DFPC (Design of Fully-Pneumatic Control Circuit)
		                                   	
		                                         Dessert Making
		                                   	
		                                         Drawing specifications and requirement
		                                   	
		                                         EDM DIE SINKING OPERATION
		                                   	
		                                         ELECTRONIC EQUIPMENT &amp; APPLIANCE INSTALLATION AND TROUBLESHOOTING EE-021-2: 2012 (PPT PROGRAM)
		                                   	
		                                         Effective Communication in OSH *New
		                                   	
		                                         Effective Presentation and Communication
		                                   	
		                                         Effective Safety and Health Committee
*New
		                                   	
		                                         Effective Safety and Health Committee
*New
		                                   	
		                                         Effective Safety and Health Committee
		                                   	
		                                         Effective Safety and Health Committee
		                                   	
		                                         Effective Safety and Health Committee
		                                   	
		                                         Effective Safety and Health Committee
		                                   	
		                                         Effective Safety and Health Committee
		                                   	
		                                         Effective Safety and Health Committee
		                                   	
		                                         Effective Safety and Health Committee
		                                   	
		                                         Effective Safety and Health Committee
		                                   	
		                                         Effective Safety and Health Committee
		                                   	
		                                         Effective Safety and Health Committee
		                                   	
		                                         Effective Safety and Health Committee
		                                   	
		                                         Effective Safety and Health Committee
		                                   	
		                                         Elevator System Operation
		                                   	
		                                         Emergency Preparedness and Response Plan
		                                   	
		                                         Emergency Preparedness and Response Plan
		                                   	
		                                         Emergency Preparedness and Response Plan
		                                   	
		                                         Emergency Preparedness and Response Plan
		                                   	
		                                         Emergency Preparedness and Response Plan
		                                   	
		                                         Emergency Preparedness and Response Plan * New
		                                   	
		                                         Emergency Preparedness and Response Plan * New
		                                   	
		                                         Emergency Preparedness and Response Plan * New
		                                   	
		                                         Emergency Preparedness and Response Plan *New
		                                   	
		                                         Emergency Preparedness and Response Plan *New
		                                   	
		                                         Emergency Preparedness and Response Plan *New
		                                   	
		                                         Emergency Preparedness and Response Plan *New
		                                   	
		                                         Emergency Preparedness and Response Plan *New
		                                   	
		                                         Emergency Preparedness and Response Plan *New
		                                   	
		                                         Engine Maintenance
		                                   	
		                                         Environmental Management System (EMS) ISO
14001:2015 Internal Audit
		                                   	
		                                         Environmental Management System(EMS)
ISO 14001:2015 Awareness / Introduction
		                                   	
		                                         Ergonomics And Manual Handling
		                                   	
		                                         Ergonomics And Manual Handling
		                                   	
		                                         Ergonomics And Manual Handling
		                                   	
		                                         Ergonomics And Manual Handling
		                                   	
		                                         Ergonomics and Manual Handling in the
Workplace
		                                   	
		                                         Ergonomics and Manual Handling in the
Workplace
		                                   	
		                                         Ergonomics and Manual Handling in the
Workplace
		                                   	
		                                         Ergonomics and Manual Handling in the
Workplace
		                                   	
		                                         Ergonomics and Manual Handling in the
Workplace
		                                   	
		                                         Ergonomics and Manual Handling in the
Workplace
		                                   	
		                                         Ergonomics and Manual Handling in the
Workplace
		                                   	
		                                         Ergonomics and Manual Handling in the Workplace
		                                   	
		                                         Ergonomics and Manual Handling in the Workplace
		                                   	
		                                         Ergonomics and Manual Handling in the Workplace
		                                   	
		                                         Expressway Operations Safety Passport *New
		                                   	
		                                         FABRIKASI LITAR TERKAMIR LOGIK (IC)
		                                   	
		                                         FLAMMABLE REFRIGERANT CERTIFIED PERSONNEL UNDER MS 2678:2017
		                                   	
		                                         Fibre Cable Network CA-2C
		                                   	
		                                         Filing Administration
		                                   	
		                                         Fire Watcher Safety
		                                   	
		                                         Fire Watcher Safety
		                                   	
		                                         Fire Watcher Safety
		                                   	
		                                         Fire Watcher Safety
		                                   	
		                                         Fire Watcher Safety *New
		                                   	
		                                         Fitting and handling material
		                                   	
		                                         Food Safety Management System : ISO 22000
Awareness &amp; Interpretation
		                                   	
		                                         Fundamental Occupational Safety and Health for
Supervisor
		                                   	
		                                         Fundamental Occupational Safety and Health for
Supervisor
		                                   	
		                                         Fundamental Occupational Safety and Health for
Supervisor
		                                   	
		                                         Fundamental Occupational Safety and Health for
Supervisor
		                                   	
		                                         Fundamental Occupational Safety and Health for
Supervisor
		                                   	
		                                         Fundamental Occupational Safety and Health for
Supervisor
		                                   	
		                                         Fundamental Occupational Safety and Health for
Supervisor
		                                   	
		                                         Fundamental Occupational Safety and Health for Supervisor
		                                   	
		                                         Fundamental of Classification, Labelling and Safety Data Sheet of Hazardous Chemicals (BASIC) *New
		                                   	
		                                         GEOMTERICAL DIMENSIONING AND TOLERANCING (GD&amp;T)
		                                   	
		                                         GMAW Process Carbon Steel Plate 1
		                                   	
		                                         GMAW Process Carbon Steel Plate 2
		                                   	
		                                         GMAW Welding Structure Assembly
		                                   	
		                                         GRINDING MACHINE OPERATION
		                                   	
		                                         GTAW 6G WITh WQT
		                                   	
		                                         GTAW Process Aluminum Plate
		                                   	
		                                         GTAW Process Stainless Steel Plate
		                                   	
		                                         GTAW SMAW 6GC WITh WQT
		                                   	
		                                         Grinding Machine Operation
		                                   	
		                                         HVAC SYSTEM DESIGN AND AUCAD APPLICATION 
		                                   	
		                                         Handphone Repairing
		                                   	
		                                         Hazard Analysis and Critical Control Point (HACCP)
and Good Manufacturing Practice (GMP) Awareness
		                                   	
		                                         Hazard identification,Risk Assesment and
Risk Control
		                                   	
		                                         Hazard identification,Risk Assesment and
Risk Control
		                                   	
		                                         Hearing Loss Prevention and Audiometric Testing
		                                   	
		                                         Hearing Loss Prevention and Audiometric Testing
		                                   	
		                                         Hearing Loss Prevention and Audiometric Testing
		                                   	
		                                         Hearing Loss Prevention and Audiometric Testing
		                                   	
		                                         Hearing Loss Prevention and Audiometric Testing
		                                   	
		                                         Hearing Loss Prevention and Audiometric Testing
		                                   	
		                                         Hearing Loss Prevention and Audiometric Testing
		                                   	
		                                         Hearing Loss Prevention and Audiometric Testing
		                                   	
		                                         High Impact OSH Presentation Skills * New
		                                   	
		                                         Hoteliers Safety and Health (OSH) and
Competitiveness Seminar 2018
		                                   	
		                                         Hoteliers Safety and Health (OSH) and
Competitiveness Seminar 2018
		                                   	
		                                         Hoteliers Safety and Health (OSH) and
Competitiveness Seminar 2018
		                                   	
		                                         Hoteliers Safety and Health (OSH) and
Competitiveness Seminar 2018
		                                   	
		                                         Hydraulic part sub assembly process
		                                   	
		                                         ICVIM(Industrial Control Valve Instrument Maintenance)
		                                   	
		                                         IISS(Industrial Instrument Safety &amp; Security)
		                                   	
		                                         INJECTION MOULDING MACHINE OPERATION  (SIRI 1)
		                                   	
		                                         INJECTION MOULDING MACHINE OPERATION  (SIRI 2)
		                                   	
		                                         INJECTION MOULDING TROUBLE SHOOTING 
		                                   	
		                                         INSTRUMENTASI
BASIC ELECTRICAL INSTRUMENT
		                                   	
		                                         INSTRUMENTASI
BASIC MECHANICAL INSTRUMENT
		                                   	
		                                         INSTRUMENTASI
CARRY OUT CASCADE LOOP PARAMETER  SETTING
		                                   	
		                                         INSTRUMENTASI
CARRY OUT CONTROL LOOP FUNCTION CHECK
		                                   	
		                                         INSTRUMENTASI
CARRY OUT CONTROL LOOP LOGIC FUNCTION CHECK 
		                                   	
		                                         INSTRUMENTASI
CARRY OUT CONTROL VALVE LEAK TEST
		                                   	
		                                         INSTRUMENTASI
CARRY OUT CONTROL VALVE POSITIONED SERVICE
		                                   	
		                                         INSTRUMENTASI
CARRY OUT CONTROLLER FUNCTION CHECK
		                                   	
		                                         INSTRUMENTASI
CARRY OUT CURRENT TO PNEUMATIC CALIBRATION
		                                   	
		                                         INSTRUMENTASI
CARRY OUT ELECTRICAL TRANSMISSION LINES INSTALLATION
		                                   	
		                                         INSTRUMENTASI
CARRY OUT FILTER REGULATOR SERVICE
		                                   	
		                                         INSTRUMENTASI
CARRY OUT FIRE ALARM FUNCTION CHECK
		                                   	
		                                         INSTRUMENTASI
CARRY OUT FLOW SWITCH CALIBRATION
		                                   	
		                                         INSTRUMENTASI
CARRY OUT FLOW TRANSMITTER CALIBRATION
		                                   	
		                                         INSTRUMENTASI
CARRY OUT GAS DETECTOR CHECK
		                                   	
		                                         INSTRUMENTASI
CARRY OUT GAUGE CALIBRATION
		                                   	
		                                         INSTRUMENTASI
CARRY OUT HEAT DETECTOR CHECK
		                                   	
		                                         INSTRUMENTASI
CARRY OUT INSTRUMENT AIR DRYER SEQUENCE
		                                   	
		                                         INSTRUMENTASI
CARRY OUT INSTRUMENT AIR REGULATOR SERVICING
		                                   	
		                                         INSTRUMENTASI
CARRY OUT LEVEL SWITCH CALIBRATION
		                                   	
		                                         INSTRUMENTASI
CARRY OUT LEVEL TRANSMITTER CALIBRATION
		                                   	
		                                         INSTRUMENTASI
CARRY OUT PNEUMATIC TRANSMISSION LINES INSTALLATION
		                                   	
		                                         INSTRUMENTASI
CARRY OUT PRESSURE SWITCH CALIBRATION
		                                   	
		                                         INSTRUMENTASI
CARRY OUT PRESSURE TRANSMITTER CALIBRATION
		                                   	
		                                         INSTRUMENTASI
CARRY OUT PROCESS LOOP TUNING
		                                   	
		                                         INSTRUMENTASI
CARRY OUT PROCESS RECORDER CALIBRATION
		                                   	
		                                         INSTRUMENTASI
CARRY OUT SAFETY COMPLIANCE SUPERVISION
		                                   	
		                                         INSTRUMENTASI
CARRY OUT SMOKE DETECTOR CHECK
		                                   	
		                                         INSTRUMENTASI
CARRY OUT SOLENOID FUNCTION CHECK
		                                   	
		                                         INSTRUMENTASI
CARRY OUT TEMPERATURE SWITCH CALIBRATION
		                                   	
		                                         INSTRUMENTASI
CARRY OUT TEMPERATURE TRANSMITTER CALIBRATION
		                                   	
		                                         INSTRUMENTASI
CARRY OUT UV/IR DETECTOR CHECK
		                                   	
		                                         INSTRUMENTASI
CONDUCT STAFF BRIEFING
		                                   	
		                                         INSTRUMENTASI
COORDINATE TEST EQUIPMENT VALIDATION
		                                   	
		                                         INSTRUMENTASI
ELECTRICAL CONTROL COMPONENTS
		                                   	
		                                         INSTRUMENTASI
MAINTAIN CONTROL COMPONENT FUNCTION
		                                   	
		                                         INSTRUMENTASI
MAINTAIN CONTROL VALVE MOVING MECHANISM
		                                   	
		                                         INSTRUMENTASI
MAINTAIN DISTRIBUTED CONTROL SYSTEM(DCS)
		                                   	
		                                         INSTRUMENTASI
MAINTAIN INSTRUMENT AIR SYSTEM SEQUENCE
		                                   	
		                                         INSTRUMENTASI
MAINTAIN LIMIT SWITCH FUNCTION
		                                   	
		                                         INSTRUMENTASI
OVERHAUL CONTROL VALVE
		                                   	
		                                         INSTRUMENTASI
PENDAFTARAN KURSUS INSTRUMENT
		                                   	
		                                         INSTRUMENTASI
PERFORM UPLOAD AND DOWNLOAD OF PLC PROGRAM
		                                   	
		                                         INSTRUMENTASI
PLAN PREVENTIVE MAINTENANCE 
		                                   	
		                                         INSTRUMENTASI
PLAN TRAINING NEED’S
		                                   	
		                                         INSTRUMENTASI
REPLACE BLOWN ELECTRICAL FUSES
		                                   	
		                                         INSTRUMENTASI
REPLACE FAULTY CARD
		                                   	
		                                         INSTRUMENTASI
REPLACE FAULTY FIELD INTERFACE CARD
		                                   	
		                                         INSTRUMENTASI
REPLACE INTRINSIC SAFETY (IS) BARRIER
		                                   	
		                                         INSTRUMENTASI
SUPERVISE CORRECTIVE MAINTENANCE IMPLEMENTATION
		                                   	
		                                         INSTRUMENTASI
SUPERVISE PREVENTIVE MAINTENANCE  IMPLEMENTATION
		                                   	
		                                         INSTRUMENTASI
TROUBLESHOOT AIR COMPRESSOR CONTROL &amp; MONITORING INSTRUMENT FAULTS
		                                   	
		                                         INSTRUMENTASI
TROUBLESHOOT AIR DRYER CONTROL &amp; MONITORING INSTRUMENT FAULT
		                                   	
		                                         INSTRUMENTASI
TROUBLESHOOT CONTROL SYSTEM FAULT
		                                   	
		                                         INSTRUMENTASI
TROUBLESHOOT CONTROL SYSTEM LOOP FAULT
		                                   	
		                                         INSTRUMENTASI
TROUBLESHOOT FLOW TRANSMITTER  FAULT
		                                   	
		                                         INSTRUMENTASI
TROUBLESHOOT LEVEL TRANSMITTER  FAULT
		                                   	
		                                         INSTRUMENTASI
TROUBLESHOOT PRESSURE TRANSMITTER  FAULT
		                                   	
		                                         INSTRUMENTASI
TROUBLESHOOT TEMPERATURE TRANSMITTER  FAULT
		                                   	
		                                         INSTRUMENTASI
VERIFY CONTRACTORS’ WORK
		                                   	
		                                         INSTRUMENTASI 
EVALUATE PROCESS CHARACTERISTICS DATA
		                                   	
		                                         IPLC(Intoduction to Programmable Logic Controller)
		                                   	
		                                         IRCA Approved Environmental Management System
(EMS) ISO 14001:2015 Lead Auditor
		                                   	
		                                         IRCA Approved Quality Management System (QMS)
ISO 9001:2015 Lead Auditor
		                                   	
		                                         Incident Reporting And Analysis Technique
		                                   	
		                                         Incident Reporting And Analysis Technique
		                                   	
		                                         Incident Reporting And Analysis Technique
		                                   	
		                                         Incident Reporting And Analysis Technique
		                                   	
		                                         Incident Reporting and Analys is Technique
*New
		                                   	
		                                         Incident Reporting and Analys is Technique
*New
		                                   	
		                                         Incident Reporting and Analysis Technique
		                                   	
		                                         Incident Reporting and Analysis Technique * New
		                                   	
		                                         Incident Reporting and Analysis Technique * New
		                                   	
		                                         Incident Reporting and Analysis Technique * New
		                                   	
		                                         Incident Reporting and Analysis Technique * New
		                                   	
		                                         Incident Reporting and Analysis Technique * New
		                                   	
		                                         Incident Reporting and Analysis Technique * New
		                                   	
		                                         Incident Reporting and Analysis Technique * New
		                                   	
		                                         Incident Reporting and Analysis Technique *New
		                                   	
		                                         Incident Reporting and Analysis Technique *New
		                                   	
		                                         Indoor Air Quality Assessor*
		                                   	
		                                         Indoor Air Quality Assessor*
		                                   	
		                                         Indoor Air Quality Assessor*
		                                   	
		                                         Indoor Air Quality Assessor*
		                                   	
		                                         Industrial Automation Control Systems software 
		                                   	
		                                         Industrial Hygiene Technician (Chemical Monitoring) *
		                                   	
		                                         Industrial Hygiene Technician (Chemical Monitoring) *
		                                   	
		                                         Industrial Hygiene Technician (Chemical Monitoring) *
		                                   	
		                                         Industrial Hygiene Technician (Chemical Monitoring) *
		                                   	
		                                         Industrial Hygiene Technician (Inspection, Testing
and Examination of Engineering Control Equipment )*
		                                   	
		                                         Industrial Hygiene Technician (Inspection, Testing
and Examination of Engineering Control Equipment )*
		                                   	
		                                         Industrial Hygiene Technician (Inspection, Testing
and Examination of Engineering Control Equipment )*
		                                   	
		                                         Industrial Hygiene Technician (Inspection, Testing and Examination of Engineering Control Equipment )*
		                                   	
		                                         Industrial automation engineering sketching
		                                   	
		                                         Inert Space Entry
		                                   	
		                                         Inert Space Entry
		                                   	
		                                         Inert Space Entry
		                                   	
		                                         Inert Space Entry
		                                   	
		                                         Inert Space Entry
		                                   	
		                                         Inert Space Entry
		                                   	
		                                         Inert Space Entry
		                                   	
		                                         Inert Space Entry
		                                   	
		                                         Injection Moulding Production Process
		                                   	
		                                         Introduction to 2D Drawing Using AutoCAD
		                                   	
		                                         Jubah
		                                   	
		                                         Jubah Lelaki
		                                   	
		                                         Juruteknik Servis Bertauliah Sektor Penyejukbekuan Dan Penyaman Udara (Racs)
		                                   	
		                                         KURSUS VIDEOGRAFI - KAMERA &amp; SUNTINGAN
		                                   	
		                                         Kekuda IBS (Coldform)
		                                   	
		                                         Kerja Paip Penyamanan Udara 
		                                   	
		                                         Kiken Yochi Training
		                                   	
		                                         Kiken Yochi Training
		                                   	
		                                         Kiken Yochi Training
		                                   	
		                                         Kiken Yochi Training
		                                   	
		                                         Kiken Yochi Training * New
		                                   	
		                                         Kiken Yochi Training * New
		                                   	
		                                         Kiken Yochi Training * New
		                                   	
		                                         Kiken Yoohi Training
		                                   	
		                                         Kiken Yoohi Training
		                                   	
		                                         Kursus Asas Pendawaian Elektrik
		                                   	
		                                         Kursus Keusahawanan
		                                   	
		                                         Kursus Pengendalian Refrigerant (CSTP)
		                                   	
		                                         LATHE MACHINE OPERATION
		                                   	
		                                         Langsir
		                                   	
		                                         Laser Cutting Machine Operation
		                                   	
		                                         Laundry Skill
		                                   	
		                                         Lifting &amp; Slinging Technique using  Pillar Mounted Jibcrane
		                                   	
		                                         Low Voltage Overhead Line Modular
		                                   	
		                                         Lung Function Testing and Analysis
		                                   	
		                                         Lung Function Testing and Analysis
		                                   	
		                                         Lung Function Testing and Analysis
		                                   	
		                                         Lung Function Testing and Analysis
		                                   	
		                                         Lung Function Testing and Analysis
		                                   	
		                                         Lung Function Testing and Analysis
		                                   	
		                                         Lung Function Testing and Analysis
		                                   	
		                                         Lung Function Testing and Analysis
		                                   	
		                                         MANAGING INDUSTRIAL HYGIENE ISSUES AT WORKPLACE
		                                   	
		                                         MANAGING MENTAL ISSUES AT THE WORKPLACE
		                                   	
		                                         MEASURING INSTRUMENT HANDLING

		                                   	
		                                         MECHANICAL MACHINE MAINTENANCE
		                                   	
		                                         MEREKABENTUK GRAFIK UNTUK WEB, BANNERS &amp; FLYERS 
		                                   	
		                                         MIHS (Maintain Industrial Hydraulic System)
		                                   	
		                                         MOBILE DEVICE CONFIGURATION                                                          
		                                   	
		                                         MODUL HIASAN DALAMAN  : LANDSKAP KERJA KAYU        
		                                   	
		                                         MOULD DESIGN ENGINEERING
		                                   	
		                                         Machine Maintenance (Mechanical System)
		                                   	
		                                         Machining Operation (Lathe)
		                                   	
		                                         Machining Operation (Milling)
		                                   	
		                                         Malaysian Sustainable Palm Oil (MSPO)
MS 2530:2013 Awareness / Introduction
		                                   	
		                                         Malaysian Sustainable Palm Oil MS 2530:2013
(MSPO)Lead Auditor
		                                   	
		                                         Malaysian Sustanaible Palm Oil (MSPO)
MS 2530:2013 Internal Audit
		                                   	
		                                         Malaysian Sustanaible Palm Oil (MSPO)
MS 2530:2013 Interpretation and Implementation 
		                                   	
		                                         Managing Mental Issue at The Workplace
		                                   	
		                                         Managing Mental Issue at The Workplace
		                                   	
		                                         Managing Mental Issue at The Workplace
		                                   	
		                                         Managing Mental Issue at The Workplace
		                                   	
		                                         Marketing Essential
		                                   	
		                                         Meeting Management
		                                   	
		                                         Memasang Penyaman Udara Jenis Berasingan
		                                   	
		                                         Membaiki Telefon Pintar
		                                   	
		                                         Memperkasa Budaya Keselamatan &amp; Kesihatan
Pekerjaan
		                                   	
		                                         Memperkasa Budaya Keselamatan &amp; Kesihatan
Pekerjaan
		                                   	
		                                         Memperkasa Budaya Keselamatan &amp; Kesihatan
Pekerjaan
		                                   	
		                                         Memperkasa Budaya Keselamatan &amp; Kesihatan
Pekerjaan
		                                   	
		                                         Microsoft Office Excel 2013 (Advance)
		                                   	
		                                         Microsoft Office Excel 2013 (Basic)
		                                   	
		                                         Microsoft Office Excel 2013 - Advanced
		                                   	
		                                         Microsoft Office Excel 2013 - Intermediate
		                                   	
		                                         Microsoft Office Excel 2013 – Basic
		                                   	
		                                         Microsoft Office Power Point 2013 – Advanced
		                                   	
		                                         Microsoft Office Power Point 2013 – Basic &amp;
Intermediate
		                                   	
		                                         Microsoft Office Word 2013 (Advance)
		                                   	
		                                         Microsoft Office Word 2013 – Advanced
		                                   	
		                                         Microsoft Office Word 2013 – Basic
		                                   	
		                                         Microsoft Office Word 2013 – Intermediate
		                                   	
		                                         Microsoft Publisher (Intermediate)
		                                   	
		                                         Milling Machine Operation
		                                   	
		                                         Monitoring of Noise Exposure*
		                                   	
		                                         Monitoring of Noise Exposure*
		                                   	
		                                         Monitoring of Noise Exposure*
		                                   	
		                                         Monitoring of Noise Exposure*
		                                   	
		                                         Mug Press &amp; Design
		                                   	
		                                         NIOSH - Nestle Safety Passport
		                                   	
		                                         NIOSH - Port Safety Passport
		                                   	
		                                         NIOSH - Port Safety Passport
		                                   	
		                                         NIOSH - Port Safety Passport
		                                   	
		                                         NIOSH - Port Safety Passport
		                                   	
		                                         NIOSH -TENAGA Safety Passport - (Level 1)
		                                   	
		                                         NIOSH -TENAGA Safety Passport - (Level 1)
		                                   	
		                                         NIOSH -TENAGA Safety Passport - (Level 2)
		                                   	
		                                         NIOSH -TENAGA Safety Passport - (Level 2)
		                                   	
		                                         NIOSH -TENAGA Safety Passport - Level 1
		                                   	
		                                         NIOSH -TENAGA Safety Passport - Level 1
		                                   	
		                                         NIOSH -TENAGA Safety Passport - Level 1
		                                   	
		                                         NIOSH -TENAGA Safety Passport - Level 2
		                                   	
		                                         NIOSH -TENAGA Safety Passport - Level 2
		                                   	
		                                         NIOSH -TENAGA Safety Passport - Level 2
		                                   	
		                                         NIOSH -TM Safety Passport
		                                   	
		                                         NIOSH -TM Safety Passport
		                                   	
		                                         NIOSH -TM Safety Passport
		                                   	
		                                         NIOSH -TM Safety Passport
		                                   	
		                                         NIOSH -TM Safety Passport
		                                   	
		                                         NIOSH -TM Safety Passport
		                                   	
		                                         NIOSH -TM Safety Passport
		                                   	
		                                         NIOSH -TM Safety Passport
		                                   	
		                                         NIOSH -TM Safety Passport
		                                   	
		                                         NIOSH -TM Safety Passport
		                                   	
		                                         NIOSH -TM Safety Passport
		                                   	
		                                         NIOSH -TM Safety Passport
		                                   	
		                                         NIOSH -TM Safety Passport
		                                   	
		                                         NIOSH -TM Safety Passport
		                                   	
		                                         NIOSH -TM Safety Passport
		                                   	
		                                         NIOSH -TM Safety Passport
		                                   	
		                                         NIOSH -TNB Safety Passport - Level 1
		                                   	
		                                         NIOSH -TNB Safety Passport - Level 1
		                                   	
		                                         NIOSH -TNB Safety Passport - Level 2
		                                   	
		                                         NIOSH -TNB Safety Passport - Level 2
		                                   	
		                                         NIOSH -Tenaga Safety Passport - Level 1
		                                   	
		                                         NIOSH -Tenaga Safety Passport - Level 1
		                                   	
		                                         NIOSH -Tenaga Safety Passport - Level 1
		                                   	
		                                         NIOSH -Tenaga Safety Passport - Level 1
		                                   	
		                                         NIOSH -Tenaga Safety Passport - Level 2
		                                   	
		                                         NIOSH -Tenaga Safety Passport - Level 2
		                                   	
		                                         NIOSH -Tenaga Safety Passport - Level 2
		                                   	
		                                         NIOSH -Tenaga Safety Passport - Level 2
		                                   	
		                                         NIOSH Prasarana Safety Passport
		                                   	
		                                         NIOSH TM Safety Passport (NTMSP)
		                                   	
		                                         NIOSH Tenaga Safety Passport - Level 1
		                                   	
		                                         NIOSH Tenaga Safety Passport - Level 2
		                                   	
		                                         NIOSH – Maybank Safety Passport
		                                   	
		                                         NIOSH-DBKK Safety Passport
		                                   	
		                                         NIOSH-DBKK Safety Passport
		                                   	
		                                         NIOSH-DBKK Safety Passport
		                                   	
		                                         NIOSH-DBKK Safety Passport
		                                   	
		                                         NIOSH-NUitm Safety Passport
		                                   	
		                                         NIOSH-NUitm Safety Passport
		                                   	
		                                         NIOSH-NUitm Safety Passport
		                                   	
		                                         NIOSH-NUitm Safety Passport
		                                   	
		                                         OSH Management System : MS 1722 &amp; OHSAS 18001
Internal Audit*
		                                   	
		                                         OSH Management System : MS1722 &amp; OHSAS
18001 Interpretation and Implementation*
		                                   	
		                                         OSH Management System : MS1722 &amp; OHSAS 18001
Lead Auditor
		                                   	
		                                         OSH SUSTAINABILITY APPROACH FOR CONSTRUCTION INDUSTRY
		                                   	
		                                         OSH for Design Inspection, Testing and
Examination of Local Exhaust Ventilation System
		                                   	
		                                         OSH for Design Inspection, Testing and
Examination of Local Exhaust Ventilation System
		                                   	
		                                         OSH for Design Inspection, Testing and
Examination of Local Exhaust Ventilation System
		                                   	
		                                         OSH for Design Inspection, Testing and
Examination of Local Exhaust Ventilation System
		                                   	
		                                         OSH in Plantation : Health Problem of Plantation
Workes
		                                   	
		                                         OSH in Plantation : Health Problem of Plantation
Workes
		                                   	
		                                         OSH in Plantation : Health Problem of Plantation
Workes
		                                   	
		                                         OSH in Plantation : Health Problem of Plantation
Workes
		                                   	
		                                         Occupational Health Doctor *
		                                   	
		                                         Occupational Health Doctor *
		                                   	
		                                         Occupational Health Doctor *
		                                   	
		                                         Occupational Health Doctor *
		                                   	
		                                         Occupational Health Doctor *
		                                   	
		                                         Occupational Health Doctor *
		                                   	
		                                         Occupational Health Doctor *
		                                   	
		                                         Occupational Health Doctor *
		                                   	
		                                         Occupational Health Doctor *
		                                   	
		                                         Occupational Health Doctor *
		                                   	
		                                         Occupational Health Doctor Examination
Workshop
		                                   	
		                                         Occupational Health Doctor Examination
Workshop
		                                   	
		                                         Occupational Health Doctor Examination
Workshop
		                                   	
		                                         Occupational Health Doctor Examination Workshop
		                                   	
		                                         Occupational Health Doctor Examination Workshop
		                                   	
		                                         Occupational Health Doctor Examination Workshop
		                                   	
		                                         Occupational Health Doctor Examination Workshop
		                                   	
		                                         Occupational Health Doctor Examination Workshop
		                                   	
		                                         Occupational Health Doctor*
		                                   	
		                                         Occupational Health Doctor*
		                                   	
		                                         Occupational Health Doctor*
		                                   	
		                                         Occupational Health Doctor*
		                                   	
		                                         Occupational Health Nurse Examination
Workshop
		                                   	
		                                         Occupational Health Nurse Examination
Workshop
		                                   	
		                                         Occupational Health Nurse Examination
Workshop
		                                   	
		                                         Occupational Health Nurse Examination Workshop
		                                   	
		                                         Occupational Health Nurse Examination Workshop
		                                   	
		                                         Occupational Health Nurse Examination Workshop
		                                   	
		                                         Occupational Health Nurse Examination Workshop
		                                   	
		                                         Occupational Health Nurse Examination Workshop
		                                   	
		                                         Occupational Health Nurse*
		                                   	
		                                         Occupational Health Nurse*
		                                   	
		                                         Occupational Health Nurse*
		                                   	
		                                         Occupational Health Nurse*
		                                   	
		                                         Occupational Health Nurse*
		                                   	
		                                         Occupational Health Nurse*
		                                   	
		                                         Occupational Health Nurse*
		                                   	
		                                         Occupational Health Nurse*
		                                   	
		                                         Occupational Health Nurse*
		                                   	
		                                         Occupational Health Nurse*
		                                   	
		                                         Occupational Health Nurse*
		                                   	
		                                         Occupational Health Nurse*
		                                   	
		                                         Occupational Safety And Health For Construction
Personnel
		                                   	
		                                         Occupational Safety And Health For Construction
Personnel
		                                   	
		                                         Occupational Safety And Health For Construction
Personnel
		                                   	
		                                         Occupational Safety And Health For Construction
Personnel
		                                   	
		                                         Occupational Safety And Health For Construction
Personnel
		                                   	
		                                         Occupational Safety And Health For Construction
Personnel
		                                   	
		                                         Occupational Safety And Health For Construction
Personnel
		                                   	
		                                         Occupational Safety And Health For Construction Personnel
		                                   	
		                                         Occupational Safety And Health In The Office
		                                   	
		                                         Occupational Safety And Health In The Office
		                                   	
		                                         Occupational Safety And Health In The Office
		                                   	
		                                         Occupational Safety And Health In The Office
		                                   	
		                                         Occupational Safety and Health ACT 1994
(OSHA 1994)
		                                   	
		                                         Occupational Safety and Health ACT 1994
(OSHA 1994)
		                                   	
		                                         Occupational Safety and Health Act 1994
		                                   	
		                                         Occupational Safety and Health Act 1994
		                                   	
		                                         Occupational Safety and Health Act 1994
		                                   	
		                                         Occupational Safety and Health Act 1994
		                                   	
		                                         Occupational Safety and Health Act 1994
		                                   	
		                                         Occupational Safety and Health Act 1994
		                                   	
		                                         Occupational Safety and Health Act 1994
		                                   	
		                                         Occupational Safety and Health Act 1994
		                                   	
		                                         Occupational Safety and Health in The
Office
		                                   	
		                                         Occupational Safety and Health in The
Office
		                                   	
		                                         Occupational Safety and Health in the Office
		                                   	
		                                         Occupational Safety and Health in the Office
		                                   	
		                                         Occupational Safety and Health in the Office
		                                   	
		                                         Occupational Safety and Health in the Office
		                                   	
		                                         Occupational Safety and Health in the Office
		                                   	
		                                         Occupational Safety and Health in the Office
		                                   	
		                                         Occupational Safety and Health in the Office
		                                   	
		                                         Occupational Safety and Health in the Office
		                                   	
		                                         Occupational Safety, Health And Environment
Management
		                                   	
		                                         Occupational Safety, Health And Environment
Management
		                                   	
		                                         Occupational Safety, Health And Environment
Management
		                                   	
		                                         Occupational Safety, Health And Environment
Management
		                                   	
		                                         Occupational Safety, Health And Environment
Management
		                                   	
		                                         Occupational Safety, Health And Environment
Management
		                                   	
		                                         Occupational Safety, Health And Environment
Management
		                                   	
		                                         Occupational Safety, Health And Environment Management
		                                   	
		                                         Occupational Safety, health and Environment
Management
		                                   	
		                                         Occupational Safety, health and Environment
Management
		                                   	
		                                         Occupational Safety, health and Environment
Management
		                                   	
		                                         Occupational Safety, health and Environment
Management
		                                   	
		                                         Occupational Safety,Health and
Environment Management
		                                   	
		                                         Occupational Safety,Health and
Environment Management
		                                   	
		                                         Oil &amp; Gas Safety Passport (Certificate by NIOSH)
		                                   	
		                                         Oil and Gas Safety Passport
		                                   	
		                                         Oil and Gas Safety Passport
		                                   	
		                                         Oil and Gas Safety Passport
		                                   	
		                                         Oil and Gas Safety Passport
		                                   	
		                                         Oil and Gas Safety Passport
		                                   	
		                                         Oil and Gas Safety Passport
		                                   	
		                                         Oil and Gas Safety Passport
		                                   	
		                                         Oil and Gas Safety Passport
		                                   	
		                                         Oil and Gas Safety Passport
		                                   	
		                                         Oil and Gas Safety Passport
		                                   	
		                                         Oil and Gas Safety Passport
		                                   	
		                                         Oil and Gas Safety Passport
		                                   	
		                                         Oil and Gas Safety Passport
		                                   	
		                                         Oil and Gas Safety Passport
		                                   	
		                                         Oil and Gas Safety Passport - Level 1
		                                   	
		                                         Oil and Gas Safety Passport - Level 1
		                                   	
		                                         Oil and Gas Safety Passport - Level 2
		                                   	
		                                         Oil and Gas Safety Passport - Level 2
		                                   	
		                                         Oil and Gas Safety Passport - Refresher
		                                   	
		                                         Oil and Gas Safety Passport - Refresher
		                                   	
		                                         Oil and Gas Safety Passport - Refresher
		                                   	
		                                         Oil and Gas Safety Passport - Refresher
		                                   	
		                                         Oil and Gas Safety Passport - Refresher
		                                   	
		                                         Oil and Gas Safety Passport - Refresher
		                                   	
		                                         Oil and Gas Safety Passport - Refresher
		                                   	
		                                         Oil and Gas Safety Passport - Refresher
		                                   	
		                                         Oil and Gas Safety Passport - Refresher
		                                   	
		                                         Oil and Gas Safety Passport - Refresher
		                                   	
		                                         Oil and Gas Safety Passport - Refresher
		                                   	
		                                         Oil and Gas Safety Passport - Refresher
		                                   	
		                                         Oil and Gas Safety Passport - Refresher
		                                   	
		                                         Oil and Gas Safety Passport - Refresher
		                                   	
		                                         Online Marketing
		                                   	
		                                         Operate, Maintenance, Testing &amp; Calibration LV Double Feeder Switchboard
		                                   	
		                                         Operating &amp; Troubleshoot Roller Conveyer System.
		                                   	
		                                         Optical Fibre Cable Splicing (Telekom Malaysia)
		                                   	
		                                         Optical Fibre Cable Testing(Telekom Malaysia)
		                                   	
		                                         PENDAWAI 1 FASA
		                                   	
		                                         PENDAWAI 3 FASA
		                                   	
		                                         PENDAWAIAN ELEKTRIK 1 FASA
		                                   	
		                                         PENDAWAIAN ELEKTRIK 3 FASA
		                                   	
		                                         PENGBUNGKUSAN LITAR TERKAMIR (IC) / ' IC PACKAGING PROCESS
		                                   	
		                                         PENGURUSAN KKP DISEKTOR PERTANIAN (PERLADANGAN DAN PENTERNAKAN
		                                   	
		                                         PERSIJILAN SKM MELALUI KAEDAH PPT
		                                   	
		                                         PLASTICS INJECTION MOULDING OPERATION START UP
MC-101-2:2015-C01
MC-101-2:2015-C02
		                                   	
		                                         PLASTICS INJECTION MOULDING OPERATION START UP
MC-101-2:2015-C03
MC-101-2:2015-C04
		                                   	
		                                         PLASTICS INJECTION MOULDING OPERATION START UP
MC-101-2:2015-C05
MC-101-2:2015-C06
		                                   	
		                                         PREDICTIVE MAINTENANCE WITH MACHINERY DIAGNOSIS
		                                   	
		                                         Parametric Part Design and Sketching Concept
		                                   	
		                                         Pattern and template development
		                                   	
		                                         Pemasangan Unit Penyamanan Udara Domestik
		                                   	
		                                         Pemasangan dan penyelenggaraan Penyaman udara split unit
		                                   	
		                                         Pemasangan struktur bangunan menggunakan konkrit bertetulang
		                                   	
		                                         Pembuatan Bag Tote
		                                   	
		                                         Pengenalan Kepada Jahitan
		                                   	
		                                         Pengurusan Refrigeran -Refrigeration Service Sector (RSS) kerjasama dengan Jabatan Alam Sekitar (JAS)
		                                   	
		                                         Penyelenggaraan Penyamanan Udara kenderaan
		                                   	
		                                         Plumbing maintenance
		                                   	
		                                         Pneumatic part sub assembly process
		                                   	
		                                         Prevention of Occupational Diseases in The
Workplace
		                                   	
		                                         Prevention of Occupational Diseases in The
Workplace
		                                   	
		                                         Prevention of Occupational Diseases in The
Workplace
		                                   	
		                                         Prevention of Occupational Diseases in The
Workplace
		                                   	
		                                         Process Safety Management
		                                   	
		                                         Process Safety Management
		                                   	
		                                         Process Safety Management
		                                   	
		                                         Process Safety Management
		                                   	
		                                         Process Safety Management
		                                   	
		                                         Process Safety Management
		                                   	
		                                         Process Safety Management
		                                   	
		                                         Process Safety Management
		                                   	
		                                         Pump Operation &amp; Maintenance
		                                   	
		                                         Quality Management System (QMS) ISO 9001:2015
Awareness / Introduction
		                                   	
		                                         Quality Management System (QMS) ISO 9001:2015
Internal Audit
		                                   	
		                                         REFRIGERATION &amp; AIR CONDITIONING SERVICING SECTORS (RACS)
		                                   	
		                                         SKILLS FOUNDATION CERTIFICATE (BASIC ENGINEERING SKILLS)
		                                   	
		                                         SKILLS PROFICIENCY CERTIFICATE (BASIC FABRICATION, WELDING AND PIPEWORK)
		                                   	
		                                         SKM 2 MACHINING OPERATION MC-050-02 (PPT PROGRAM)
		                                   	
		                                         SKM 3 MACHINING OPERATION MC-050-03 (PPT PROGRAM)
		                                   	
		                                         SMAW 3G WITh WQT
		                                   	
		                                         SMAW 6G WITh WQT
		                                   	
		                                         SMAW Process Carbon Steel Pipe 1
		                                   	
		                                         SMAW Process Carbon Steel Pipe 2
		                                   	
		                                         SMAW Process Carbon Steel Pipe 3
		                                   	
		                                         SMAW Process Carbon Steel Plate 1
		                                   	
		                                         SMAW Process Carbon Steel Plate 2
		                                   	
		                                         SMAW Process Dissimilar Metal
		                                   	
		                                         SMAW Process Fundamental
		                                   	
		                                         SMAW Welding Structure Assembly
		                                   	
		                                         Safe And Defensive Driving
		                                   	
		                                         Safe And Defensive Driving
		                                   	
		                                         Safe And Defensive Driving
		                                   	
		                                         Safe And Defensive Driving
		                                   	
		                                         Safe Handling of Forklift Truck
		                                   	
		                                         Safe Handling of Forklift Truck
		                                   	
		                                         Safe Handling of Forklift Truck
		                                   	
		                                         Safe Handling of Forklift Truck
		                                   	
		                                         Safe Handling of Forklift Truck
		                                   	
		                                         Safe Handling of Forklift Truck
		                                   	
		                                         Safe Handling of Forklift Truck
		                                   	
		                                         Safe Handling of Forklift Truck
		                                   	
		                                         Safe Handling of Forklift Truck
		                                   	
		                                         Safe Handling of Forklift Truck
		                                   	
		                                         Safe Handling of Forklift Truck
		                                   	
		                                         Safe Handling of Forklift Truck
		                                   	
		                                         Safe Handling of Forklift Truck Refresher
		                                   	
		                                         Safe Handling of Forklift Truck Refresher
		                                   	
		                                         Safe Handling of Forklift Truck Refresher
		                                   	
		                                         Safe Handling of Forklift Truck Refresher
		                                   	
		                                         Safe Handling of Forklift Truck Refresher
		                                   	
		                                         Safe Handling of Forklift Truck Refresher
		                                   	
		                                         Safe Handling of Forklift Truck Refresher
		                                   	
		                                         Safe Handling of Forklift Truck Refresher
		                                   	
		                                         Safe Handling of Forklift Truck Refresher
		                                   	
		                                         Safe Handling of Forklift Truck Refresher
		                                   	
		                                         Safe Motorcycle Riding for Workers
		                                   	
		                                         Safe Operation Of High Pressure Water Jet
		                                   	
		                                         Safe Operation Of High Pressure Water Jet
		                                   	
		                                         Safe Operation Of High Pressure Water Jet
		                                   	
		                                         Safe Operation Of High Pressure Water Jet
		                                   	
		                                         Safe Operation Of High Pressure Water Jet Refresher
		                                   	
		                                         Safe Operation Of High Pressure Water Jet Refresher
		                                   	
		                                         Safe Operation Of High Pressure Water Jet Refresher
		                                   	
		                                         Safe Operation Of High Pressure Water Jet Refresher
		                                   	
		                                         Safe Operation of High Pressure
Water Jetting
		                                   	
		                                         Safe Operation of High Pressure
Water Jetting
		                                   	
		                                         Safe Operation of High Pressure Water
Jetting Refresher
		                                   	
		                                         Safe Operation of High Pressure Water
Jetting Refresher
		                                   	
		                                         Safe Working in The Hydrogent Sulphide
Environment
		                                   	
		                                         Safe Working in The Hydrogent Sulphide
Environment
		                                   	
		                                         Safe Working in The Hydrogent Sulphide
Environment
		                                   	
		                                         Safe Working in The Hydrogent Sulphide
Environment
		                                   	
		                                         Safe Working in The Hydrogent Sulphide
Environment
		                                   	
		                                         Safe Working in The Hydrogent Sulphide
Environment
		                                   	
		                                         Safe Working in The Hydrogent Sulphide
Environment
		                                   	
		                                         Safe Working in The Hydrogent Sulphide Environment
		                                   	
		                                         Safe Working int the Hydrogen Suphide
Environment
		                                   	
		                                         Safe Working int the Hydrogen Suphide
Environment
		                                   	
		                                         Safety &amp; Health in Islam Perspective
		                                   	
		                                         Safety &amp; Health in Islam Perspective
		                                   	
		                                         Safety &amp; Health in Islam Perspective
		                                   	
		                                         Safety &amp; Health in Islam Perspective
		                                   	
		                                         Safety In The Use of Chemical
		                                   	
		                                         Safety In The Use of Chemical
		                                   	
		                                         Safety In The Use of Chemical
		                                   	
		                                         Safety In The Use of Chemical
		                                   	
		                                         Safety and Defensive Driving
		                                   	
		                                         Safety and Health Mandatory Awareness Seminar
for Private and Public Sectors
		                                   	
		                                         Safety and Health Mandatory Awareness Seminar
for Private and Public Sectors
		                                   	
		                                         Safety and Health Mandatory Awareness Seminar
for Private and Public Sectors
		                                   	
		                                         Safety and Health Mandatory Awareness Seminar
for Private and Public Sectors
		                                   	
		                                         Safety and Health Officer (Full Time)*
(Weekend Class - Saturday &amp; Sunday)
		                                   	
		                                         Safety and Health Officer (Full Time)*
		                                   	
		                                         Safety and Health Officer (Full Time)*
		                                   	
		                                         Safety and Health Officer (Full Time)*
		                                   	
		                                         Safety and Health Officer (Full Time)*
		                                   	
		                                         Safety and Health Officer (Full Time)*
		                                   	
		                                         Safety and Health Officer (Full Time)*
		                                   	
		                                         Safety and Health Officer (Full Time)*
		                                   	
		                                         Safety and Health Officer (Full Time)*
		                                   	
		                                         Safety and Health Officer (Full Time)*
		                                   	
		                                         Safety and Health Officer (Full Time)*
		                                   	
		                                         Safety and Health Officer (Full Time)*
		                                   	
		                                         Safety and Health Officer (Full Time)*
		                                   	
		                                         Safety and Health Officer (Full Time)*
		                                   	
		                                         Safety and Health Officer (Full Time)*
		                                   	
		                                         Safety and Health Officer (Full Time)*
		                                   	
		                                         Safety and Health Officer (Modular)*
		                                   	
		                                         Safety and Health Officer (Modular)*
		                                   	
		                                         Safety and Health Officer (Modular)*
		                                   	
		                                         Safety and Health Officer (Modular)*
		                                   	
		                                         Safety and Health Officer (Modular)*
		                                   	
		                                         Safety and Health Officer (Part Time)*
(Weekend Class - Saturday &amp; Sunday)
		                                   	
		                                         Safety and Health Officer (Part Time)*
(Weekend Class - Saturday &amp; Sunday)
		                                   	
		                                         Safety and Health Officer (Part Time)*
(Weekend Class - Saturday &amp; Sunday)
		                                   	
		                                         Safety and Health Officer (Part Time)*
(Weekend Class - Saturday &amp; Sunday)
		                                   	
		                                         Safety and Health Officer (Part Time)*
(Weekend Class - Saturday &amp; Sunday)
		                                   	
		                                         Safety and Health Officer (Part Time)*
(Weekend Class - Saturday &amp; Sunday)
		                                   	
		                                         Safety and Health Officer (Part Time)*
(Weekend Class - Saturday &amp; Sunday)
		                                   	
		                                         Safety and Health Officer (Part Time)*
(Weekend Class - Saturday &amp; Sunday)
		                                   	
		                                         Safety and Health Officer (Part Time)*
(Weekend Class - Saturday &amp; Sunday)
		                                   	
		                                         Safety and Health Officer (Part Time)*
Weekend Class - Friday &amp; Saturday)
		                                   	
		                                         Safety and Health Officer (Part Time)*
Weekend Class - Friday &amp; Saturday)
		                                   	
		                                         Safety and Health Officer (Part Time)*
		                                   	
		                                         Safety and Health Officer (Part Time)*
		                                   	
		                                         Safety and Health Officer (Part Time)*
		                                   	
		                                         Safety and Health Officer (Part Time)*
		                                   	
		                                         Safety and Health Officer (Part Time)* (Weekend Class - Saturday &amp; Sunday)
		                                   	
		                                         Safety and Health Officer Enhancement Programme
(Partime) (Saturday &amp; Sunday)
		                                   	
		                                         Safety and Health Officer Enhancement Programme
(Partime) (Saturday &amp; Sunday)
		                                   	
		                                         Safety and Health Officer Enhancement Programme
(Partime) (Saturday &amp; Sunday)
		                                   	
		                                         Safety and Health Officer Enhancement Programme
		                                   	
		                                         Safety and Health Officer Enhancement Programme (Partime) (Saturday &amp; Sunday)
		                                   	
		                                         Safety and Health Officer Examination Workshop
		                                   	
		                                         Safety and Health Officer Examination Workshop
		                                   	
		                                         Safety and Health Officer Examination Workshop
		                                   	
		                                         Safety and Health Officer Examination Workshop
		                                   	
		                                         Safety and Health Officer Examination Workshop
		                                   	
		                                         Safety and Health Officer Examination Workshop
		                                   	
		                                         Safety and Health Officer Examination Workshop
		                                   	
		                                         Safety and Health Officer Examination Workshop
		                                   	
		                                         Safety and Health Officer Improvement
Programme (Fri, Sat, Sun)
		                                   	
		                                         Safety and Health Officer Improvement
Programme (Fri, Sat, Sun)
		                                   	
		                                         Safety and Health Officer Improvement
Programme (Fri, Sat, Sun)
		                                   	
		                                         Safety and Health Officer Improvement
Programme (Fri, Sat, Sun)
		                                   	
		                                         Safety in the Use of Chemicals
		                                   	
		                                         Safety in the Use of Chemicals
		                                   	
		                                         Safety in the Use of Chemicals
		                                   	
		                                         Safety in the Use of Chemicals
		                                   	
		                                         Safety in the Use of Chemicals
		                                   	
		                                         Safety in the Use of Chemicals
		                                   	
		                                         Safety in the Use of Chemicals
		                                   	
		                                         Safety in the Use of Chemicals
		                                   	
		                                         Safety in the Use of Chemicals
		                                   	
		                                         Safety in the Use of Chemicals
		                                   	
		                                         Safety in the Use of Chemicals
		                                   	
		                                         Safety in the Use of Chemicals
		                                   	
		                                         Sarawak Energy Safety Passport
		                                   	
		                                         Sarawak Energy Safety Passport
		                                   	
		                                         Sarawak Energy Safety Passport
		                                   	
		                                         Sarawak Energy Safety Passport
		                                   	
		                                         Scaffolding Level 1
		                                   	
		                                         Selenggara Penyaman Udara Berasingan
		                                   	
		                                         Selenggara Penyaman Udara Kenderaan
		                                   	
		                                         Seluar Hamil
		                                   	
		                                         Seluar Palazo
		                                   	
		                                         Seluar Panjang
		                                   	
		                                         Seluar Pendek
		                                   	
		                                         Seluar Slek
		                                   	
		                                         Seminar
		                                   	
		                                         Seminar
		                                   	
		                                         Seminar
		                                   	
		                                         Seminar
		                                   	
		                                         Servis Unit Penyamanan Udara Domestik dan Baikpulih Kerosakan Unit Penyamanan Udara Domestik
		                                   	
		                                         Shirt Press &amp; Design (Sublimation)
		                                   	
		                                         Shirt Press &amp; Design (Vinyl)
		                                   	
		                                         Site Safety Supervisor
		                                   	
		                                         Site Safety Supervisor
		                                   	
		                                         Site Safety Supervisor
		                                   	
		                                         Site Safety Supervisor
		                                   	
		                                         Site Safety Supervisor
		                                   	
		                                         Site Safety Supervisor
		                                   	
		                                         Site Safety Supervisor
		                                   	
		                                         Site Safety Supervisor
		                                   	
		                                         Site Safety Supervisor
		                                   	
		                                         Site Safety Supervisor
		                                   	
		                                         Site Safety Supervisor
		                                   	
		                                         Site Safety Supervisor
		                                   	
		                                         Site Safety Supervisor
		                                   	
		                                         Site Safety Supervisor
		                                   	
		                                         Site Safety Supervisor
		                                   	
		                                         Site Safety Supervisor
		                                   	
		                                         Site Safety Supervisor (Part Time) - Friday &amp; Saturday
		                                   	
		                                         Site Safety Supervisor (Part Time) - Friday &amp; Saturday
		                                   	
		                                         Site Safety Supervisor (Part Time) - Saturday &amp; Sunday
		                                   	
		                                         Site Safety Supervisor (Part Time) - Saturday &amp; Sunday
		                                   	
		                                         Site Safety Supervisor (Part Time) - Saturday &amp; Sunday
		                                   	
		                                         Site Safety Supervisor (Part Time) - Saturday &amp; Sunday
		                                   	
		                                         Site Safety Supervisor (Part Time) - Saturday &amp; Sunday
		                                   	
		                                         Site Safety Supervisor (Part Time) - Saturday &amp; Sunday
		                                   	
		                                         Skirt A-Line
		                                   	
		                                         Skirt Loceng
		                                   	
		                                         Skirt Pinggang Mendatang
		                                   	
		                                         Standard Inpection Process (Quality Control)
		                                   	
		                                         Syabas NIOSH Safety Card
		                                   	
		                                         TEKNOLOGI FABRIKASI ASAS BINGKAI BINAAN


		                                   	
		                                         TEKNOLOGI FABRIKASI ASAS KIMPALAN

		                                   	
		                                         TEKNOLOGI FABRIKASI ASAS KIMPALAN (SMAW)

		                                   	
		                                         TEKNOLOGI FABRIKASI ASAS KIMPALAN (SMAW)
		                                   	
		                                         TEKNOLOGI FABRIKASI ASAS KIMPALAN (SMAW)
		                                   	
		                                         TEKNOLOGI FABRIKASI ASAS PEMOTONGAN GAS OKSI-ASITILIN

		                                   	
		                                         TEKNOLOGI FABRIKASI ASAS PEMOTONGAN GAS OKSI-ASITILIN

		                                   	
		                                         TEKNOLOGI FABRIKASI ASAS PEMOTONGAN GAS OKSI-ASITILIN
		                                   	
		                                         TEKNOLOGI FABRIKASI ASAS PEMOTONGAN GAS OKSI-ASITILIN
		                                   	
		                                         TEKNOLOGI FABRIKASI MEMBINA LUKISAN HAMPARAN MENGGUNAKAN KOMPUTER (PERISIAN AUTOCAD KAEDAH SELARI
		                                   	
		                                         TEKNOLOGI FABRIKASI MEMBINA LUKISAN HAMPARAN MENGGUNAKAN KOMPUTER (PERISIAN AUTOCAD) KAEDAH JEJARI

		                                   	
		                                         TEKNOLOGI FABRIKASI MEMBUAT JERIJI (GRILL) PINTU/TINGKAP DAN BUMBUNG  (AWNING) RUMAH
		                                   	
		                                         TEKNOLOGI PENYELENGGARAAN MEKANIKAL
* Knowledge of various types of program.
		                                   	
		                                         TEKNOLOGI PENYELENGGARAAN MEKANIKAL
* PLC and others (eg. PIC) parts
		                                   	
		                                         TEKNOLOGI PENYELENGGARAAN MEKANIKAL
Basic programming and propose modification
		                                   	
		                                         TEKNOLOGI PENYELENGGARAAN MEKANIKAL
Command, Coordinate entry,Drawing aid, Layer
		                                   	
		                                         TEKNOLOGI PENYELENGGARAAN MEKANIKAL
Drawing command such as point, line,arc, circle, chamfer
		                                   	
		                                         TEKNOLOGI PENYELENGGARAAN MEKANIKAL
Editing command such as trim, copy, mirror etc.
		                                   	
		                                         TEKNOLOGI PENYELENGGARAAN MEKANIKAL
Hardware requirement,Software requirement
		                                   	
		                                         TEKNOLOGI PENYELENGGARAAN MEKANIKAL
Input/output hydraulic device 
		                                   	
		                                         TEKNOLOGI PENYELENGGARAAN MEKANIKAL
Knowledge on procedure of downloading
		                                   	
		                                         TEKNOLOGI PENYELENGGARAAN MEKANIKAL
Knowledge on various type of input/output  terminal of various PLC
		                                   	
		                                         TEKNOLOGI PENYELENGGARAAN MEKANIKAL
PERFORM PNEUMATIC SYSTEM DRAWING

		                                   	
		                                         TEKNOLOGI PENYELENGGARAAN MEKANIKAL
PERFORM WELDING MACHINE FUNCTIONALITY TEST

		                                   	
		                                         TEKNOLOGI PENYELENGGARAAN MEKANIKAL
PERFORM WELDING MACHINE MAINTENANCE

		                                   	
		                                         TEKNOLOGI PENYELENGGARAAN MEKANIKAL
Part list / bill of material
		                                   	
		                                         TEKNOLOGI PENYELENGGARAAN MEKANIKAL
Perform PLC system drawing
		                                   	
		                                         TEKNOLOGI PENYELENGGARAAN MEKANIKAL
Perform PLC system functionality test
		                                   	
		                                         TEKNOLOGI PENYELENGGARAAN MEKANIKAL
Perform hydraulic system functionality test
		                                   	
		                                         TEKNOLOGI PENYELENGGARAAN MEKANIKAL
Perform phydraulic system drawing
		                                   	
		                                         TEKNOLOGI PENYELENGGARAAN MEKANIKAL
Perform rotating equipment functionality test
		                                   	
		                                         TEKNOLOGI PENYELENGGARAAN MEKANIKAL
Perform rotating equipment maintenance
		                                   	
		                                         TEKNOLOGI PENYELENGGARAAN MEKANIKAL
Specification of various  components
		                                   	
		                                         TEKNOLOGI PENYELENGGARAAN MEKANIKAL
Standard dimensioning ISO and sectioning
		                                   	
		                                         TEKNOLOGI PENYELENGGARAAN MEKANIKAL
System initialization
		                                   	
		                                         TEKNOLOGI PENYELENGGARAAN MEKANIKAL
Type of output device suchas plotter and printer
		                                   	
		                                         TEKNOLOGI PENYELENGGARAAN MEKANIKAL
Types and functions of hydraulic  system components
		                                   	
		                                         TEKNOLOGI PENYELENGGARAAN MEKANIKAL 
Input/output pneumatic device 
		                                   	
		                                         TEKNOLOGI PENYELENGGARAAN MEKANIKAL 
MEASURE MATERIAL ANGULAR MEASUREMENT
		                                   	
		                                         TEKNOLOGI PENYELENGGARAAN MEKANIKAL 
MEASURE MATERIAL INTERNAL AND EXTERNAL DIAMETER
		                                   	
		                                         TEKNOLOGI PENYELENGGARAAN MEKANIKAL 
MEASURE MATERIAL LINEAR MEASUREMENT
		                                   	
		                                         TEKNOLOGI PENYELENGGARAAN MEKANIKAL 
PERFORM DRILLING MACHINE OPERATION
		                                   	
		                                         TEKNOLOGI PENYELENGGARAAN MEKANIKAL 
PERFORM LATHE MACHINE OPERATION

		                                   	
		                                         TEKNOLOGI PENYELENGGARAAN MEKANIKAL 
PERFORM MILLING MACHINE OPERATION 
		                                   	
		                                         TEKNOLOGI PENYELENGGARAAN MEKANIKAL 
Perform pneumatic system functionality test
		                                   	
		                                         TEKNOLOGI PENYELENGGARAAN MEKANIKAL 
Types and functions of pneumatic  system components
		                                   	
		                                         The use of Personal Protective Equipment againts
Chemical Hazards
		                                   	
		                                         The use of Personal Protective Equipment againts
Chemical Hazards
		                                   	
		                                         The use of Personal Protective Equipment againts
Chemical Hazards
		                                   	
		                                         The use of Personal Protective Equipment againts
Chemical Hazards
		                                   	
		                                         Train the Trainer
		                                   	
		                                         Train the Trainer
		                                   	
		                                         Train the Trainer
		                                   	
		                                         Train the Trainer
		                                   	
		                                         Train the Trainer
		                                   	
		                                         Train the Trainer
		                                   	
		                                         Train the Trainer
		                                   	
		                                         Train the Trainer
		                                   	
		                                         Train the Trainer
		                                   	
		                                         Train the Trainer
		                                   	
		                                         Train the Trainer
		                                   	
		                                         Train the Trainer
		                                   	
		                                         Train the Trainer
		                                   	
		                                         Train the Trainer
		                                   	
		                                         Train the Trainer
		                                   	
		                                         Train the Trainer
		                                   	
		                                         Training Management for Business
		                                   	
		                                         Training Management for Business
		                                   	
		                                         Training Management for Business
		                                   	
		                                         Training Management for Business
		                                   	
		                                         Training Management for Business
		                                   	
		                                         Training Management for Business
		                                   	
		                                         Training Management for Business
		                                   	
		                                         Training Management for Business
		                                   	
		                                         Training Management for Business
		                                   	
		                                         Training Management for Business
		                                   	
		                                         Training Management for Business
		                                   	
		                                         Training Management for Business
		                                   	
		                                         Transportation of Dangerous Goods By Road
		                                   	
		                                         Transportation of Dangerous Goods By Road
		                                   	
		                                         Transportation of Dangerous Goods By Road
		                                   	
		                                         Transportation of Dangerous Goods By Road
		                                   	
		                                         Transportation of Dangerous Goods By Road
		                                   	
		                                         Transportation of Dangerous Goods By Road
		                                   	
		                                         Transportation of Dangerous Goods By Road
		                                   	
		                                         Transportation of Dangerous Goods By Road
		                                   	
		                                         Understanding the Requirements of OSH
Management Systems ISO 45001:2018
		                                   	
		                                         Understanding, Evaluating and
Implementing Effective HIRARC at The
Workplace
		                                   	
		                                         Understanding, Evaluating and
Implementing Effective HIRARC at The
Workplace
		                                   	
		                                         Understanding, Evaluating and Implementing
Effective HIRARC at The Workplace
		                                   	
		                                         Understanding, Evaluating and Implementing
Effective HIRARC at The Workplace
		                                   	
		                                         Understanding, Evaluating and Implementing
Effective HIRARC at The Workplace
		                                   	
		                                         Understanding, Evaluating and Implementing
Effective HIRARC at The Workplace
		                                   	
		                                         Understanding, Evaluating and Implementing
Effective HIRARC at The Workplace
		                                   	
		                                         Understanding, Evaluating and Implementing
Effective HIRARC at The Workplace
		                                   	
		                                         Understanding, Evaluating and Implementing
Effective HIRARC at The Workplace
		                                   	
		                                         Understanding, Evaluating and Implementing
Effective HIRARC at The Workplace
		                                   	
		                                         Understanding, Evaluating and Implementing
Effective HIRARC at The Workplace
		                                   	
		                                         Understanding, Evaluating and Implementing
Effective HIRARC at The Workplace
		                                   	
		                                         Understanding, Evaluating and Implementing
Effective HIRARC at The Workplace
		                                   	
		                                         Understanding, Evaluating and Implementing Effective HIRARC at The Workplace
		                                   	
		                                         Upgrade Skills  For Fitters
		                                   	
		                                         VEHICLE AIR-CONDITIONING RECTIFICATION WORK
		                                   	
		                                         VEHICLE BASIC MAINTENANCE
		                                   	
		                                         VISUAL WELDING INSPECTOR CSWIP 3.0
		                                   	
		                                         VRF SYSTEM AND MAINTENANCE
		                                   	
		                                         Vehicle Air-CondITioning Maintenance
		                                   	
		                                         Visual Welding Inspector (CSWIP 3.0)
		                                   	
		                                         Vocational Hair Stylist Course (Ladies)
		                                   	
		                                         Vocational Hair Stylist Course (Men)
		                                   	
		                                         Water Safety For Responders *New
		                                   	
		                                         Welder Qualification Test(WQT) FCAW 3G(Carbon Steel Plate)
		                                   	
		                                         Welder Qualification Test(WQT) GTAW 6G(Carbon Steel Pipe)
		                                   	
		                                         Welder Qualification Test(WQT) GTAW 6G(Stainless steel)
		                                   	
		                                         Welder Qualification Test(WQT) GTAW and SMAW 6G(Carbon Steel Pipe)
		                                   	
		                                         Welder Qualification Test(WQT) SMAW 3G(Carbon Steel Plate)
		                                   	
		                                         Welder Qualification Test(WQT) SMAW 6G(Carbon Steel Pipe)
		                                   	
		                                         Welder Qualification Test(WQT) SMAW 6GR(Carbon Steel Pipe)
		                                   	
		                                         Welding for industrial
		                                   	
		                                         Wireman 1st Grade
		                                   	
		                                         Wireman 2nd Grade
		                                   	
		                                         Work At Height Aerial Rigger Level 1
		                                   	
		                                         Working At Height
		                                   	
		                                         Working At Height
		                                   	
		                                         Working At Height
		                                   	
		                                         Working At Height
		                                   	
		                                         Working At Height Refresher
		                                   	
		                                         Working At Height Refresher
		                                   	
		                                         Working At Height Refresher
		                                   	
		                                         Working At Height Refresher
		                                   	
		                                         Working Safely at Height
		                                   	
		                                         Working Safely at Height
		                                   	
		                                         Working Safely at Height
		                                   	
		                                         Working Safely at Height
		                                   	
		                                         Working Safely at Height
		                                   	
		                                         Working Safely at Height
		                                   	
		                                         Working Safely at Height
		                                   	
		                                         Working Safely at Height
		                                   	
		                                         Working Safely at Height
		                                   	
		                                         Working Safely at Height
		                                   	
		                                         Working Safely at Height
		                                   	
		                                         Working Safely at Height
		                                   	
		                                         Working Safely at Height Refresher
		                                   	
		                                         Working Safely at Height Refresher
		                                   	
		                                         Working Safely at Height Refresher
		                                   	
		                                         Working Safely at Height Refresher
		                                   	
		                                         Working Safely at Height Refresher
		                                   	
		                                         Working Safely at Height Refresher
		                                   	
		                                         Working Safely at Height Refresher
		                                   	
		                                         Working Safely at Height Refresher
		                                   	
		                                         Worshop Safety Practise
		                                   	
		                                         Yayasan Sabah Safety Passport
		                                   	
		                                         Yayasan Sabah Safety Passport
		                                   	
		                                         Yayasan Sabah Safety Passport
		                                   	
		                                         Yayasan Sabah Safety Passport
		                                   	
										Safety and Health Officer (Full Time)*
(Weekend Class - Saturday &amp; Sunday)
									

									
										
										Bidang Latihan  
										
									
								

								
																
								
									
										Tempoh (Hari) 
										
									

									
										Sebab Keperluan* 
										
											Memenuhi Kehendak Majikan
											Tingkatkan Kemahiran
										Memenuhi Kehendak Majikan
										
									
								
							

							
								
									Senarai Pekerjaan yang diminati
									
										
                                           Arkitek Reka Bentuk
                                        
                                           Arkitek Reka Bentuk
                                        
									
								
							
						
					
				
			
		

		
			PERAKUAN ORANG BERINSURANS
			
				
					
						
							
								 
									 
										Saya mengakui bahawa maklumat yang diberikan di atas adalah benar dan berjanji akan mematuhi semua syarat dan garis panduan Pertubuhan Keselamatan Sosial (PERKESO) dan arahan yang dikeluarkan dan dikuatkuasakan oleh PERKESO dari masa ke semasa. Saya juga memahami bahawa, PERKESO boleh menggantung faedah ini pada bila-bila masa sekiranya didapati terdapat pemalsuan ataupun didapati tidak menjalani kursus dengan sebaiknya 
								
								
							
						
					
				
			
		
		
		
			DOKUMEN SOKONGAN LATIHAN
			
				
					
						
						
							Muat Naik
						
						
					
				
				
					
	                  	
	                 		
								
									
										Nama Dokumen
										Jenis Dokumen
										Huraian 
										Tindakan
									
								
								
									
										
										
										
									
								
							
							* Maksima 5 Dokumen Sokongan
						
					
				
			
		

	
		PENGESYORAN PEGAWAI PENEMPATAN PEKERJAAN
		
			

				
					
						Jenis Pengesyoran*
						
							--Sila Pilih--
							
								
								Syor Latihan 
							
								
								Latihan Tidak Sesuai 
							
								
								Tidak Memenuhi Syarat
							
								
								Lain-lain 
							
						Syor Latihan 
					
				

				
					
						Jika Pilih Lain, Sila Nyatakan*
						
					
				

				
					
						Catatan Pegawai Penempatan Pekerjaan*
						abc
					
				

				
					
						Nama Pegawai Penempatan Pekerjaan 
						
					

					
						 Tarikh   
						
					
				
			
		
	

	
		
			PENGESYORAN PEGAWAI PENEMPATAN SENIOR
			
				
					
						
							Jenis Pengesyoran*
							
								--Sila Pilih--
								
									
									Memerlukan Latihan
								
									
									Latihan Tidak Sesuai 
								
									
									Tidak Memenuhi Syarat
								
									
									Lain-lain + Hantar Semula
								
							Memerlukan Latihan
						
					

					
						
							Jika Pilih Lain, Sila Nyatakan*
							
						
					

					
						
							Catatan Negeri Pegawai Pekerjaan Kanan / Catatan Pegawai Negeri Pekerjaan Kanan *
							abc
						
					

					
						
							Nama Negeri Pegawai Pekerjaan Kanan/ Pegawai Negeri Pekerjaan Kanan  
							
						

						
							 Tarikh   
							
						
					
				
			
		
	
	
		
			SEMAKAN PEGAWAI VOKASIONAL(IBU PEJABAT)
			
				
					
					
						
							Jenis Keputusan*
							
								--Sila Pilih--
								
									
									Maklumat Lengkap
								
									
									Maklumat Tidak Lengkap + Hantar Semula
								
							Maklumat Lengkap
						
					

					
						
							Catatan Pegawai Vokasional (Ibu Pejabat)*
							
						
					

					
						
							Nama Pegawai Vokasional (Ibu Pejabat) 
							
						

						
							 Tarikh   
							
						
					

				
			
		
	


	

		
			 Kembali 
			
			
				
				Hantar
			
			
			
		
	
	




































	
		
			
				
					Muat Naik DOKUMEN SOKONGAN 
					
						
	                        
	                        	
	                        		
                     				
	                        		
	                        			
	                        				Lokasi Fail
	                        				
	                        			
	                        		
	                        		
	                        		
	                        			
	                        			
	                        		
	                        		
	                        		
	                        			
	                        				Huraian 
	                        				
	                        			
	                        		
	                        		
	                        		
										
											
												Kembali
											
										
										
	    								
	    									
	    										Hantar
	    									
	    								
									
	                        	
							
                        
					
				
			
		
	



	







$(document).ready(function() {
	$(&quot;select&quot;).select2({
		theme:'bootstrap'
	});
	
	if($('select[name=esoTypeOfRecommendation]').val() == '4'){
		$('#esoOtherDiv').show();
	}
	
	if($('select[name=seoTypeOfRecommendation]').val() == '4'){
		$('#seoOtherDiv').show();
	}
	
	if($('select[name=hvoTypeOfRecommendation]').val() == '4'){
		$('#kuOtherDiv').show();
	}
	
	$('.dateAnimate').datepicker( {
        yearRange: &quot;c-10:c+10&quot;,
        changeMonth: true,
        changeYear: true,
        showButtonPanel: true,
        dateFormat: 'd/m/yy'
    });
	
	$('#docFile').change(function() {
		var fileInput = $(this);
		var ext = this.value.match(/\.(.+)$/)[1].toLowerCase();
		if (fileInput.length &amp;&amp; fileInput[0].files &amp;&amp; fileInput[0].files.length) {
			var url = window.URL || window.webkitURL;
			var image = new Image();
			if(this.files[0].size > 5242880) {
				alert(&quot;Only maximum 5MB file size supported.\nYou file size is over 5MB&quot;);
				$('#docFile').val('');
			}
		}
		$('#uploadDocBtn').attr('newUpload', 'true');
	});
	
// 	$('#docType').change(function() {
// 		$('#documentType').val($('#docType').val());
		
// 	 	$('#uploadDocBtn').attr('newUpload', 'true');
// 	});
	
  	$('#uploadDocBtn').attr('onclick', &quot;return $(this).fupload(event,$('#documentType').val());&quot;);
	$('#uploadDocBtn').click(function() {
		$('#docFile').val('');
// 		$('#docType').val('');
		$('#docDesc').val('');
		$('#supportDoc').modal('toggle');
		
		$(&quot;select&quot;).select2({
			theme : 'bootstrap'
		});
	});
	
	var listDocSize = '0';
	if(listDocSize &lt; 5) {
		$('#uploadDocBtnEs').show();
	} else {
		$('#uploadDocBtnEs').hide();
	}
});

$('#esoTypeOfRecommendation').change(function() {
    var selected = $(this).val();
    if(selected == '4'){
      	$('#esoOtherDiv').show();
    }else{
      	$('#esoOtherDiv').hide();
      	$('#esoOtherRecommendation').val('');
    }
});

$('#seoTypeOfRecommendation').change(function() {
    var selected = $(this).val();
    if(selected == '4'){
		$('#seoOtherDiv').show();
   	}else{
    	$('#seoOtherDiv').hide();
        $('#seoOtherRecommendation').val('');
 	}
}); 

$('#hvoTypeOfRecommendation').change(function() {
    var selected = $(this).val();
    if(selected == '4'){
		$('#kuOtherDiv').show();
   	}else{
    	$('#kuOtherDiv').hide();
        $('#hvoOtherRecommendation').val('');
 	}
}); 

$('#courseNameId').change(function() {
	var selected = $(this).val();
	$.ajax({
		data: {&quot;trainingId&quot; : selected},
        url: &quot;trainingInfo&quot;,
        dataType: 'json',
        success: function (result) {
        	if(result) {
        		if(!$.isEmptyObject(result)){
        			$.each(result, function(i, item) {
						if(i == 0) {
							$(&quot;#trainingFieldId&quot;).val(item.trainingField);
      				  		$(&quot;#durationId&quot;).val(item.duration);
      				  		
      				  		getInstList(item.trainingInstituteId);
  				  			$('#instituteId').val(item.trainingInstituteId);
  				  			console.log(&quot;inst value : &quot; + $('#instituteId').val());
      				  	
      					}
					});

        			$(&quot;#trainingFieldId&quot;).prop('disabled',true);
	            	$(&quot;#durationId&quot;).prop('disabled',true);
	        		
        		}else {
        			$(&quot;#trainingFieldId&quot;).prop('disabled',true);
	            	$(&quot;#durationId&quot;).prop('disabled',true);
	        	}
        	} else {
        		$('#selectCase').find('option').remove();
        		$('#searchIpButton').addClass('disable-input');
        	}
        },
        complete : function() {
            unblockUI();  
        }
	});
       
});


$('#instituteId').change(function() {
	var selected = $(this).val();
	//var trainingInstituteId = $(&quot;#instituteId&quot;).val();
	
	$.ajax({
		data: {&quot;trainingInstituteId&quot; : selected},
        url: &quot;getInstInfo&quot;,
        dataType: 'json',
        success: function (result) {
        	if(result) {
        		if(!$.isEmptyObject(result)){
        			$.each(result, function(i, item) {
						if(i == 0) {
	  				  		$(&quot;#trainingFieldId&quot;).val('');
  				  			$(&quot;#durationId&quot;).val('');
						}
					}); 
        			
        			mapInstituteList();
        			
        		}else {
        			/* $(&quot;#trainingFieldId&quot;).prop('disabled',true);
	           	    $(&quot;#durationId&quot;).prop('disabled',true); */
	        	}
        	} else {
        		$('#selectCase').find('option').remove();
        		$('#searchIpButton').addClass('disable-input');
        	}
        },
        complete : function() {
            unblockUI();
        }
	});
       
});

function mapInstituteList(){
	
	console.log(&quot;mapInstituteList called&quot;);
	
	var trainingInstituteId = $(&quot;#instituteId&quot;).val();
	
	$.ajax({
		data: {&quot;trainingInstituteId&quot; : trainingInstituteId},
        url: &quot;mapInstituteUrl&quot;,
        dataType: 'json',
        success: function (result) {
        	if(result) {
        		if(!$.isEmptyObject(result)){
        				
    				$('#courseNameId').find('option').remove();
        			$('#courseNameId').append($('&lt;option value&quot;&quot; >&lt;/option>'));
        			$('#courseNameId').find('option').remove().end().append('&lt;option value=&quot;&quot;>--Sila Pilih--&lt;/option>').val('Please Select');
        			$.each(result, function (key, value) {
	        			$('#courseNameId').append($('&lt;option>', { 
	        		        value: key,
	        		        text : value
	        		    }));
	        		});
        		}else {
        			/* $(&quot;#trainingFieldId&quot;).prop('disabled',true);
	           	    $(&quot;#durationId&quot;).prop('disabled',true); */
	        	}
        	} else {
        		$('#selectCase').find('option').remove();
        		$('#searchIpButton').addClass('disable-input');
        	}
        },
        complete : function() {
            unblockUI();
        }
	});
}

function getInstList(id){
	
	console.log(&quot;getInstList called&quot;);
	var trainingInstituteId = $(&quot;#courseNameId&quot;).val();
	
	$.ajax({
		data: {&quot;trainingId&quot; : trainingInstituteId},
        url: &quot;getInstList&quot;,
        dataType: 'json',
        success: function (result) {
        	if(result) {
        		$('#instituteId').empty();
        		if(!$.isEmptyObject(result)){
        				
    				$('#instituteId').find('option').remove();
        			$('#instituteId').append($('&lt;option value&quot;&quot; >&lt;/option>'));
        			$('#instituteId').find('option').remove().end().append('&lt;option value=&quot;&quot;>--Sila Pilih--&lt;/option>').val('Please Select');
        			$.each(result, function (key, value) {
        				if(id == value.id){
        					$('#instituteId').append($('&lt;option>', { 
    	        		        value: value.id,
    	        		        text : value.value,
    	        		        selected : true
    	        		    }));
        				}else{
        					$('#instituteId').append($('&lt;option>', { 
    	        		        value: value.id,
    	        		        text : value.value
    	        		    }));
        				}
	        			
	        		});
        		}
        	} 
        },
        complete : function() {
            unblockUI();
        }
	});
}






				</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;memberContent&quot;)</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:attributes</name>
      <value>//div[@id='memberContent']</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <value>//body[@id='bg2']/div</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='SENARAI EOT'])[1]/following::div[1]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='TUKAR/ MENETAPKAN SEMULA KATA LALUAN'])[1]/following::div[1]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <value>//body/div</value>
   </webElementXpaths>
</WebElementEntity>
